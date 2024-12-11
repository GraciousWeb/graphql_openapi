package com.grace.graphql_openapi.config;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "GraphQL with OpenAPI",
                version = "1.0",
                description = "API documentation for GraphQL queries"
        )
)
public class SwaggerConfig {
}

