package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class BootSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSpringApplication.class, args);
	}
	@RequestMapping("/")
	public String getBootTime() {
		return LocalDate.now().toString();
	}
}
