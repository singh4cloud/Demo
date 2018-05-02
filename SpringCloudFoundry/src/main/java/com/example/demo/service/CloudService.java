package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cloud;
import com.example.demo.repository.CloudRepository;

@Service
public class CloudService {

	private CloudRepository cloudRepository;

	@Autowired
	public CloudService(CloudRepository cloudRepository) {
		super();
		this.cloudRepository = cloudRepository;
	}
	
	public Cloud getByCloudNmae(String cloudName){
		return cloudRepository.findByCloudName(cloudName);
	}
}
