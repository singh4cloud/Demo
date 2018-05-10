package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwagerConfig {

	@Bean
	public Docket EmployeeApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Rest-1").select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo")).paths(regex("/Rest.*")).build();
	}

}
