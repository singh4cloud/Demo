package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private MyConfiguration myConfiguration;

	@GetMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	public MyConfiguration getMyConfiguration() {
		return myConfiguration;
	}
	
}
