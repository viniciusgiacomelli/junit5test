package com.vinicius.api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition(info=
@Info(
        title="Testes JUnit5 API",
        version="v1",
        description="Uma API simples para treinamento de testes com JUnit"
))
public class OpenAPIConfiguration {

    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .components(new Components())
                .info(
                        new io.swagger.v3.oas.models.info.Info()
                                .title("Testes JUnit5 API")
                                .version("v1")
                                .license(
                                        new License()
                                                .name("Apache 2.0")
                                                .url("http://springdoc.org")
                                )
                );
    }

}
