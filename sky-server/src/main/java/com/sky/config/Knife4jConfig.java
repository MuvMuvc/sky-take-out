package com.sky.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class Knife4jConfig {

    @Bean
    public OpenAPI swaggerOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("苍穹外卖")
                        .description("很厉害的一个外卖平台")
                        .version("v1.0.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("设计文档"));
    }

    /**
     * GroupedOpenApi 是对接口文档分组，类似于 swagger 的 Docket
     *
     * @return
     */
    @Bean
    public GroupedOpenApi authApi() {
        return GroupedOpenApi.builder()
                // 组名
                .group("认证接口")
                // 扫描的路径，支持通配符
                .pathsToMatch("/login")
                // 扫描的包
                .packagesToScan("com.demo.controller.auth")
                .build();
    }

    @Bean
    public GroupedOpenApi sysApi() {
        return GroupedOpenApi.builder()
                .group("系统接口")
                .pathsToMatch("/sys/**")
                .build();
    }
}
