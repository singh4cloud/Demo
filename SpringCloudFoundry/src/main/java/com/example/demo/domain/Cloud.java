package com.example.demo.domain;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cloud {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cloudID;
	private String cloudName;
	private LocalDate cloudDate;
	
	
	public Cloud(Integer cloudID, String cloudName, LocalDate cloudDate) {
		super();
		this.cloudID = cloudID;
		this.cloudName = cloudName;
		this.cloudDate = cloudDate;
	}
	public Cloud() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCloudID() {
		return cloudID;
	}
	public String getCloudName() {
		return cloudName;
	}
	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}
	public LocalDate getCloudDate() {
		return cloudDate;
	}
	public void setCloudDate(LocalDate cloudDate) {
		this.cloudDate = cloudDate;
	}
	public void setCloudID(Integer cloudID) {
		this.cloudID = cloudID;
	}
	
	
}