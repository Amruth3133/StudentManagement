package com.amruth.StudentManagement.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("🎓 Student Management API")
                .version("1.0.0")
                .description("This Spring Boot REST API allows users to manage students with full CRUD operations, validation, and search features.")
        );
    }
}
