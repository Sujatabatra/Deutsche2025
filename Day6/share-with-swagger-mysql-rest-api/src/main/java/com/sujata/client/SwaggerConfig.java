package com.sujata.client;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI getNewConfig(){
    return new OpenAPI().info(
            new Info().title("Share App API")
                    .description("By Sujata Batra")

    );
    }
}
