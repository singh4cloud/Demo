package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class BootSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSpringDataApplication.class, args);
	}
	@RequestMapping("/")
	String getResponse() {
		return LocalDate.now().toString();
	}
}
