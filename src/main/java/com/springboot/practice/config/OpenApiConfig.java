package com.springboot.practice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
    return new OpenAPI()
            .info(new Info()
                    .title("SpaceShip API")
                    .description("Api for Spring Boot practice CRUD operations")
                    .version("1.0.0")
            );

    }
}
