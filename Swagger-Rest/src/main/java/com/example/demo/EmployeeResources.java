package com.example.demo;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rest/Employee")
public class EmployeeResources {

	@GetMapping()
	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee("Manvendra1", 1000l), new Employee("Manvendra2", 1000l),
				new Employee("Manvendra3", 1000l), new Employee("Manvendra4", 1000l), new Employee("Manvendra5", 1000l)

		);
	}

	@GetMapping("/GET/{EmployeeName}")
	public Employee employeeGet(@PathVariable("EmployeeName") String name) {
		return new Employee(name, 200l);
	}

	@PostMapping("/POST/{EmployeeName}")
	public Employee employeePost(@PathVariable("EmployeeName") String name) {
		return new Employee(name, 200l);
	}

	@PutMapping("/PUT/{EmployeeName}")
	public Employee employeePut(@PathVariable("EmployeeName") String name) {
		return new Employee(name, 200l);
	}

	@DeleteMapping("/DELETE/{EmployeeName}")
	public Employee employeeDelete(@PathVariable("EmployeeName") String name) {
		return new Employee(name, 200l);
	}

}
