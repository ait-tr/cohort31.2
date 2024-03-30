package de.aittr.g_31_2_jwt.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "JWT demo app",
                description = "Demo application for JSON web tokens",
                version = "1.0.0",
                contact = @Contact(
                        name = "Andrey Pomelov",
                        email = "andrey.pomelov@ait-tr.de",
                        url = "https://www.ait-tr.de/"
                )
        )
)
public class SwaggerConfig {
}