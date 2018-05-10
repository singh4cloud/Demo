package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("my")
public class MyConfiguration {

	private String name;
	private String email;
	
}
