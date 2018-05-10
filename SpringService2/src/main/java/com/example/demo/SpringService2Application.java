package com.example.demo;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringService2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringService2Application.class, args);
	}
	@RequestMapping("/Time")
	String getStatus(){
		return LocalTime.now().toString();
	}
}
