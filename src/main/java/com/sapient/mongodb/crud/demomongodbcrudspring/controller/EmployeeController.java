package com.sapient.mongodb.crud.demomongodbcrudspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.mongodb.crud.demomongodbcrudspring.model.Employee;
import com.sapient.mongodb.crud.demomongodbcrudspring.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Employee employee) {
		System.out.println(employee);
		employeeRepository.save(employee);
	}
	
	@RequestMapping(value = "/{id}") 
	public Employee read(@PathVariable String id) {
		return employeeRepository.findOneByName(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		
	}
	
	@RequestMapping(value = "/{id}", method  = RequestMethod.DELETE) 
	public void delete(String id) {
		employeeRepository.deleteById(id);
	}
}
