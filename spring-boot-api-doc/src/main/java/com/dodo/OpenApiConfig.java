package com.dodo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Pet API Documentation",
                description = "API documentation for managissssng pets.",
                version = "v1.0"
        )
)
public class OpenApiConfig {
}
