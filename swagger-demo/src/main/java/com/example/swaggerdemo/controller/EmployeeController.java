package com.example.swaggerdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/rest")
@Api(value = "Welcome Employee Rest End Point", description = "Employee Information!!!")
public class EmployeeController {

	@GetMapping("/users")
	public List<Employee> getEmployee() {
		return Arrays.asList(new Employee(101, "Kaushal", 5000L),
				new Employee(102, "Vikram", 6000L),
				new Employee(103, "Kushagra", 4000L));
	}
	
	@GetMapping("/users/{empname}")
	public Employee getEmp(@PathVariable("empname") final String empname) {
		return new Employee(108, empname, 9000L);
	}
}
