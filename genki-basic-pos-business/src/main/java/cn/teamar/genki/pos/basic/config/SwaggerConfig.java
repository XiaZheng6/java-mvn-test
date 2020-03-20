package cn.teamar.genki.pos.basic.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 庞杰(jie.pang)
 * @since 2018-03-28 10:03
 **/
@Configuration
@ConditionalOnProperty(value = "genki.basic.swagger.enable", havingValue = "true")
@EnableSwagger2
@Slf4j
public class SwaggerConfig {

    @PostConstruct
    public void init() {
        log.info("Enable Swagger");
    }

    @Bean
    public Docket createRestApi() {
        ParameterBuilder hotelIdParam = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        pars.add(hotelIdParam.name("gid").description("集团ID").
                modelRef(new ModelRef("long")).
                parameterType("header").
                required(false).defaultValue("1").build());
        pars.add(hotelIdParam.name("bid").description("品牌ID").
                modelRef(new ModelRef("long")).
                parameterType("header").
                required(false).defaultValue("1").build());
        pars.add(hotelIdParam.name("sid").description("商户ID").
                modelRef(new ModelRef("long")).
                parameterType("header").
                required(false).defaultValue("1").build());
//        pars.add(hotelIdParam.name("cid").description("cid").
//                modelRef(new ModelRef("long")).
//                parameterType("header").
//                required(false).build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.teamar.genki.pos.basic"))
                .paths(PathSelectors.any())
                .build().globalOperationParameters(pars);

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("RESTful APIs")
                .description("接口文档")
                .version("1.0")
                .build();
    }

}
