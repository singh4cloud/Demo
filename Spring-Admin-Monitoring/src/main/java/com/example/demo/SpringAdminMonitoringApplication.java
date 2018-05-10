package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SpringAdminMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminMonitoringApplication.class, args);
	}
}
