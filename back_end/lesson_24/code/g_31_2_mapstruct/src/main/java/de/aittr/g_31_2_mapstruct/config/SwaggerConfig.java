package de.aittr.g_31_2_mapstruct.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Swagger Test App",
                description = "Application for Swagger testing",
                version = "1.0.0",
                contact = @Contact(
                        name = "AIT TR",
                        email = "test@test.com",
                        url = "http://www.ait-tr.de"
                )
        )
)
public class SwaggerConfig {
}