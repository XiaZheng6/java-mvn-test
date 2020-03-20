package cn.teamar.genki.pos.basic.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 庞杰(jie.pang)
 * @since 2018-03-28 10:08
 **/
@Configuration
@ConditionalOnProperty(value = "genki.basic.cache.enable", havingValue = "true")
@EnableConfigurationProperties(CacheConfig.CacheProperties.class)
@Slf4j
public class CacheConfig implements ResourceLoaderAware {

    private ResourcePatternResolver resourcePatternResolver;

    @Autowired
    private CacheProperties cacheProperties;
    @Autowired(required = false)
    private RedisTemplate<Object, Object> redisTemplate;

    @PostConstruct
    public void init() {
        log.info("Enable Cache, config :\n {}", cacheProperties);
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourcePatternResolver = ResourcePatternUtils.getResourcePatternResolver(resourceLoader);
    }

    @Bean
    public CacheManager cacheManager() {
        CompositeCacheManager cacheManager = new CompositeCacheManager();
        List<CacheManager> managers = new ArrayList<>();
        if (cacheProperties.isEnableEhCache()) {
            EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
            factoryBean.setConfigLocation(resourcePatternResolver.getResource(cacheProperties.getEhCacheConfigLocation()));
            EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager(factoryBean.getObject());
            managers.add(ehCacheCacheManager);
        }
        if (cacheProperties.isEnableRedisCache()) {
            Assert.notNull(redisTemplate, "you should add redis configs because you has enable redis cache.");
            RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
            if (!cacheProperties.isEnableRedisDynamic()) {
                Assert.notEmpty(cacheProperties.getCaches(), "cache should not be empty!");
                redisCacheManager.setCacheNames(
                        cacheProperties.getCaches().stream().map(CacheEntity::getName).collect(Collectors.toList()));
            }
            if (cacheProperties.getDefaultExpire() != null) {
                redisCacheManager.setDefaultExpiration(cacheProperties.getDefaultExpire());
            }
            if (cacheProperties.getCaches() != null && !cacheProperties.getCaches().isEmpty()) {
                redisCacheManager.setExpires(cacheProperties.getCaches().stream()
                        .collect(Collectors.toMap(CacheEntity::getName, e -> e.getExpire().longValue())));
            }
            if (cacheProperties.isUseDefaultPrefix()) {
                redisCacheManager.setUsePrefix(true);
            }
            // redisCacheManager.setLoadRemoteCachesOnStartup(true);
            managers.add(redisCacheManager);
        }
        cacheManager.setCacheManagers(managers);
        if (!cacheProperties.isEnableRedisDynamic()) {
            cacheManager.setFallbackToNoOpCache(true);
        }
        return cacheManager;
    }


    @ConfigurationProperties(prefix = "genki.basic.cache")
    @Getter
    @Setter
    @ToString
    public static class CacheProperties {
        private boolean useDefaultPrefix = true;
        private boolean enableRedisCache = true;         private boolean enableRedisDynamic = true;
        private List<CacheEntity> caches;
        private Integer defaultExpire;
        private boolean enableEhCache = true;
        private String ehCacheConfigLocation = "classpath:ehcache.xml";
    }

    @Getter
    @Setter
    @ToString
    public static class CacheEntity {
        /**
         * cache name.
         */
        private String name;
        /**
         * seconds.
         */
        private Integer expire;
    }

}
