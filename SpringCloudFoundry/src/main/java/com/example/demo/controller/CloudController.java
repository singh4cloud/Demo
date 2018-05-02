package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Cloud;
import com.example.demo.service.CloudService;

@RestController
@RequestMapping("/cloud")
public class CloudController {
	
	private CloudService cloudService;

	@Autowired
	public CloudController(CloudService cloudService) {
		super();
		this.cloudService = cloudService;
	}

	
	@RequestMapping("/All/{cloudName}")
	public Cloud getByIndex(@PathVariable("cloudName") String cloudName){
		return cloudService.getByCloudNmae(cloudName);
	}
}