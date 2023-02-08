package com.bootcamp.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Management API", version = "2.0", description = "Management API"))
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
/*
	@Bean
	public MessageService messageService() {
		return new MessageServiceImpl();
	}
*/
