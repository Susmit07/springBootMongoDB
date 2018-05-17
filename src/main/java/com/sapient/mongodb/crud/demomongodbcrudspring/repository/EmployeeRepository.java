package com.sapient.mongodb.crud.demomongodbcrudspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.mongodb.crud.demomongodbcrudspring.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	
	public Employee findOneByName(String name);

}
