package com.example.demo;

public class Employee {

	private String name;
	private long salary;
	public Employee(String name, long salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
