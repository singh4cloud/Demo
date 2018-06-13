package com.example.demo.domain;



import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Cloud {
	@Override
	public String toString() {
		return "Cloud [cloudID=" + cloudID + ", cloudName=" + cloudName + ", cloudDate=" + cloudDate + "]";
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cloudID;
	private String cloudName;
	
	
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime cloudDate;
	
	
	public Cloud(Integer cloudID, String cloudName, LocalDateTime cloudDate) {
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
	public LocalDateTime getCloudDate() {
		return cloudDate;
	}
	public void setCloudDate(LocalDateTime cloudDate) {
		this.cloudDate = cloudDate;
	}
	public void setCloudID(Integer cloudID) {
		this.cloudID = cloudID;
	}
	
	
}