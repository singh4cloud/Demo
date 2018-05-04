package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RabbitMqCloudProducerApplication {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitMqCloudProducerApplication.class, args);
	}
	
	@RequestMapping(value="/PUT/{message}", method=RequestMethod.PUT)
	public void publish(@PathVariable("message")  String message) {
		System.out.println("RabbitMqCloudProducerApplication.publish()-----"+message);
		rabbitTemplate.convertAndSend("PCFCloud", message);
	}

}
