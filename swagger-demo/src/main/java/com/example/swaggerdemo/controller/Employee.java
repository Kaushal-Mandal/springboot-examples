package com.example.swaggerdemo.controller;

import io.swagger.annotations.ApiModelProperty;

public class Employee {

	@ApiModelProperty(notes = "Employee ID")
	private int id;
	@ApiModelProperty(notes = "Employee NAME")
	private String name;
	@ApiModelProperty(notes = "Employee SALARY")
	private Long salary;
	
	public Employee(int id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		this.salary = salary;
	}
}
