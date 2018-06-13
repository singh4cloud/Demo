package com.example.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public Cloud getByCloudName(@PathVariable("cloudName") String cloudName){
		return cloudService.getByCloudNmae(cloudName);
	}
	
	@RequestMapping("/All")
	public List<Cloud> getAll(){
		return cloudService.getAll();
	}
	
	@RequestMapping("/All/{id}")
	public Optional<Cloud> getById(@PathVariable("id") Integer id){
		return cloudService.getById(id);
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public void saveCloud(@RequestBody Cloud cloud){
		 cloudService.saveCloud(cloud);;
	}
}