package com.example.demo;

import java.time.LocalTime;

public class Person {
	private String name;
	private String city;
	private LocalTime lTime;
	public Person(String name, String city, LocalTime lTime) {
		super();
		this.name = name;
		this.city = city;
		this.lTime = lTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalTime getlTime() {
		return lTime;
	}
	public void setlTime(LocalTime lTime) {
		this.lTime = lTime;
	}
	

}
