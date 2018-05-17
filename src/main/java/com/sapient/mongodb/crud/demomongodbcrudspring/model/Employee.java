package com.sapient.mongodb.crud.demomongodbcrudspring.model;

import org.springframework.data.annotation.Id;

public class Employee {

	@Id
	private String id;
	private String name;
	private String age;
	private String emailID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", emailID=" + emailID + "]";
	}
	
}
