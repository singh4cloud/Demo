package com.spring;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	
	@org.springframework.data.annotation.Id
	private String id;
	
	private String firstName;
	private String lastName;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
