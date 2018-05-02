package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Cloud;
import com.example.demo.repository.CloudRepository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class SpringCloudFoundryApplication implements CommandLineRunner {

	@Autowired
	private CloudRepository cloudRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFoundryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		for(int i=1;i<20;i++){
			Cloud c = new Cloud();
			c.setCloudDate(LocalDate.now());
			c.setCloudName("Cloud_"+i);
			cloudRepository.save(c);
		}
		
		
	}
}
