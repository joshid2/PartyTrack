package com.example.djparty.dj_party_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "DJ Party Service API", version = "1.0", description = "API documentation for DJ Party Service"))
public class DjPartyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DjPartyServiceApplication.class, args);
	}

}
