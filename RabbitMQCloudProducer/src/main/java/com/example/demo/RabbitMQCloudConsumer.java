package com.example.demo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableRabbit
@RabbitListener(queues="PCFCloud")
public class RabbitMQCloudConsumer {

	@RabbitHandler
	@RequestMapping("/GET")
	public String onMessge(@Payload String message ) {
		System.out.println("++++++++++++++Message+++++++++++++");
		System.out.println("Message++++++++++++"+message);
		return message;
		
	}
}
