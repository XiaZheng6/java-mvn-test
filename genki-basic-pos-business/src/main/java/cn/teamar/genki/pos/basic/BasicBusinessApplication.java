package cn.teamar.genki.pos.basic;

import cn.teamar.genki.common.tools.exception.EnableBusinessExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author 庞杰(jie.pang)
 * @since 2018-03-17 15:56
 **/

@SpringBootApplication
@EnableTransactionManagement
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@MapperScan("cn.teamar.genki.pos.basic.dao")
@EnableBusinessExceptionHandler(sysType = EnableBusinessExceptionHandler.PrintType.MESSAGE_AND_STACKTRACE)
@EnableCaching
public class BasicBusinessApplication {

    private static ConfigurableApplicationContext applicationContext;

    public static ConfigurableApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(BasicBusinessApplication.class, args);
    }

}
