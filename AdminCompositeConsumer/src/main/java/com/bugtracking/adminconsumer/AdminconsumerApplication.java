package com.bugtracking.adminconsumer;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AdminconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminconsumerApplication.class);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.bugtracking.adminconsumer.controller")).build()
				.apiInfo(new ApiInfo("SPRING WITH SWAGGER API", "API CREATION", "1.0", "Free to Use",
						new Contact("BugTracking Team = Aravindh-Ajay-Balamurugan-DeepakDaniel", "/api", "bugtracking@bt.com"), "API licence", "/api",
						Collections.emptyList()));

	}

}
