package com.bisket.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bisket.api"))
                .build()
                .apiInfo(this.metaInfo());
    }

    private ApiInfo metaInfo() {
        return new ApiInfoBuilder()
                .title("Bisket Api API 문서")
                .description("Bisket Api API 문서입니다.")
                .version("1.0")
                .termsOfServiceUrl("http://bisket.com")
                .contact(
                        new Contact(
                                "bisket",
                                "http://bisket.com",
                                "soohyeon317@gmail.com"
                        )
                )
                .build();
    }

}
