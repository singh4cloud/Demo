package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
	MyConfiguration.class
})
@SpringBootApplication
public class SpringCloudConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigureApplication.class, args);
	}
}
