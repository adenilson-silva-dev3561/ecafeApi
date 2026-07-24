package eCafe.API.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI ecafeOpenApi() {

        return new OpenAPI()
                .info(new Info().title("Ecafe Api")
                        .description("API REST para gerenciamento de uma cafeteria.")
                        .version("1.0.0")
                        .contact(new Contact().name("Adenilson Rosa da Silva")
                                .email("adenilson.silva.dev.3561@gmail.com")

                        ).license(new License().name("MIT"))


                ).externalDocs(new ExternalDocumentation().description("Github").url("https://github.com/adenilson-silva-dev3561"));
    }
}
