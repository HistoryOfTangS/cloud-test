package com.tangyinzi.cloudtestservice.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration2 {

    /**
     * 配置swagger
     *
     * @return
     */
    @Bean
    public Docket restApi() {
//        ParameterBuilder tokenPar = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<>();
//        tokenPar.name(CoreConstants.X_TOKEN).description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        pars.add(tokenPar.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("默认分组")
//                .globalOperationParameters(pars)
                .apiInfo(defaultApiInfo())
                .forCodeGeneration(true)
                .useDefaultResponseMessages(false)
                .select()
                .paths(Predicates.and(Predicates.not(PathSelectors.regex("/error.*")), Predicates.not(PathSelectors.regex("/admin/.*"))))
                .build()
                .securityContexts(Lists.newArrayList(securityContext())).securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey()));
    }

    private ApiInfo defaultApiInfo(){
        return new ApiInfoBuilder()
                .title("文档标题")
                .description("<div style='font-size:14px;color:red;'>后端服务 RESTful APIs</div>")
                .contact(new Contact("name", "url", "mail"))
                .version("1.0")
                .build();
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
//                .forPaths(PathSelectors.regex("^(.*/base/auth).*$"))
                //暂时都加上吧
                .forPaths(PathSelectors.regex("^(.*)$"))
                .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference("BearerToken", authorizationScopes));
    }

    private ApiKey apiKey() {
        return new ApiKey("BearerToken", "authorization", "header");
    }
}
