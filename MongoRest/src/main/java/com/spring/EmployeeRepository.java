package com.spring;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="Empployee",path="Employee")
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	public List<Employee> findByFirstName(@Param("name") String name);
	//public Employee findByLastName(@Param("name") String name);

}
