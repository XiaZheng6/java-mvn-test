package cn.teamar.genki.pos.basic.utils;

import cn.teamar.genki.basic.common.enums.ErrorsEnum;
import cn.teamar.genki.common.tools.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Redis分布式锁
 *
 * @author jie.pang
 * @since 2017-10-17 11:53
 **/
@Slf4j
public class RedisLock {

    private RedisTemplate<String, String> redisTemplate;
    private Random random = new Random();

    /*获取锁失败后的默认等待时间，真正的等待时间时【DEFAULT_SLEEP_TIME + DEFAULT_SLEEP_TIME的随机数】*/
    private static final int DEFAULT_SLEEP_TIME = 50;
    /*锁对象RedisKey*/
    private String lockKey;
    /*锁超时时间，防止有线程持有锁因异常情况无法释放，其他线程无限的执行等待*/
    private int lockTimeout = 10 * 60 * 1000;
    /*获取锁最大等待时间*/
    private int maxWaitTime = 15 * 1000;

    /**
     * 构造函数
     *
     * @param redisTemplate Redis模板
     * @param lockKey       锁对象RedisKey
     */
    public RedisLock(RedisTemplate<String, String> redisTemplate, String lockKey) {
        this.redisTemplate = redisTemplate;
        this.lockKey = lockKey + "_lock";
    }

    /**
     * 构造函数
     *
     * @param redisTemplate Redis模板
     * @param lockKey       锁对象RedisKey
     * @param maxWaitMs     获取锁最大等待时间
     */
    public RedisLock(RedisTemplate<String, String> redisTemplate, String lockKey, int maxWaitMs) {
        this(redisTemplate, lockKey);
        this.maxWaitTime = maxWaitMs;
    }

    /**
     * 构造函数
     *
     * @param redisTemplate Redis模板
     * @param lockKey       锁对象RedisKey
     * @param maxWaitMs     获取锁最大等待时间
     * @param lockTimeout   锁超时时间
     */
    public RedisLock(RedisTemplate<String, String> redisTemplate, String lockKey, int maxWaitMs, int lockTimeout) {
        this(redisTemplate, lockKey, maxWaitMs);
        this.lockTimeout = lockTimeout;
    }

    /**
     * 接口将由任何需要使用RedisLock分布式锁的类实现
     */
    public interface RedisLockRunnable {
        Object run() throws Exception;
    }

    /**
     * 使用分布式锁执行，并返回执行结果
     *
     * @param runnable 分布式锁执行对象
     * @return 执行结果
     * @throws Exception 异常
     */
    public Object execute(RedisLockRunnable runnable) throws Exception {

        Object obj;
        try {
            if (lock()) {
                obj = runnable.run();
            } else {
                throw new BusinessException(ErrorsEnum.ILLEGAL_USER_TYPE);
            }
        } finally {
            try {
                unlock();
            } catch (Exception e) {
                log.error("RedisLock--->unlock error, exception info : {}", e);
            }

        }
        return obj;
    }

    /**
     * 获得锁
     * 实现思路:
     * 1、使用Redis的setNX命令
     * 2、Redis缓存的key是锁的key, value是锁的到期时间（注意：这里把过期时间放在value了,同时设置其超时时间，做了2重过期保障）
     * 执行过程:
     * 1、通过setnx尝试设置某个key的值,成功(当前没有这个锁)则返回,成功获得锁
     * 2、锁已经存在则获取锁的到期时间,和当前时间比较,超时的话,则设置新的值
     *
     * @return 是否获得锁成功
     * @throws InterruptedException 中断异常
     */
    private boolean lock() throws InterruptedException {
        int timeout = maxWaitTime;
        while (timeout >= 0) {
            /*
            尽量保证redis里的锁过期时间大于Key过期时间
            这样只要锁设置成功，redis里面锁到期时间一般会大于系统时间
             */
            String expiresTime = String.valueOf(System.currentTimeMillis() + lockTimeout + 2000); //锁到期时间
            if (this.setNX(lockKey, expiresTime)) {
                return true;
            }

            String redisExpiresTime = redisTemplate.opsForValue().get(lockKey); //redis里的锁过期时间

            /*
            判断是否为空，不为空的情况下，如果被其他线程设置了值，则第二个条件判断是过不去的
            这里值有可能会覆盖别人的锁的时间，但是因为相差了很少的时间，所以可以接受
             */
            if (redisExpiresTime != null && Long.parseLong(redisExpiresTime) < System.currentTimeMillis()) {
                /*获取上一个锁到期时间，并设置现在的锁到期时间*/
                String oldValueStr = redisTemplate.opsForValue().getAndSet(lockKey, expiresTime);
                redisTemplate.expire(lockKey, lockTimeout, TimeUnit.SECONDS);
                /*
                如果这个时候，多个线程恰好都到了这里，但是只会有一个线程取到的值和上一个线程设置的值相同
                （其他的线程因为getAndSet被重新赋值了，所以不会和oldValueStr相同）
                 */
                if (oldValueStr != null && oldValueStr.equals(redisExpiresTime)) {
                    return true;
                }
            }

            /*
            默认延迟时间，使用固定数+随机数，可以防止同时到达多个进程,
            每次都是以同样的频率申请锁,并发可能性更大.
             */
            long sleepMillis = random.nextInt(DEFAULT_SLEEP_TIME) + DEFAULT_SLEEP_TIME;
            timeout -= sleepMillis;
            Thread.sleep(sleepMillis);
        }
        return false;
    }

    /**
     * 释放锁
     */
    private void unlock() {
        String redisExpiresTime = redisTemplate.opsForValue().get(lockKey); //redis里的锁过期时间
        /*
        如果锁还没到超时时间，说明是当前线程自己的锁（在锁的超时时间内，不释放这个锁别人肯定得不到）
        如果锁超时了，那可能是别人的锁，无需删除（如果是自己的锁，可能这个key一直存在，直到过期或下个获取锁的线程过来能删除掉）
         */
        if (redisExpiresTime != null
                && Long.parseLong(redisExpiresTime) >= System.currentTimeMillis()) {
            redisTemplate.delete(lockKey);
        }
    }

    /**
     * Key不存在时设置value
     *
     * @param key   Redis Key
     * @param value Redis Value
     * @return 是否设置成功
     */
    private boolean setNX(final String key, final String value) {
        Boolean result = false;

        try {
            result = redisTemplate.execute((RedisCallback<Boolean>) connection -> {
                StringRedisSerializer serializer = new StringRedisSerializer();
                return connection.setNX(serializer.serialize(key), serializer.serialize(value));
            });

            if (result) {
                redisTemplate.expire(key, lockTimeout, TimeUnit.SECONDS);
            }
        } catch (Exception e) {
            log.error("RedisLock--->setNX redis error, key = {},e = ", key, e);
        }

        return result;
    }
}

