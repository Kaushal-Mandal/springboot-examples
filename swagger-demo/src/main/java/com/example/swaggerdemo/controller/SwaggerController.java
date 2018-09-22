package com.example.swaggerdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest")
@Api(value = "Welcome swagger Rest End Point", description= "Swagger Controller !!!")
public class SwaggerController {

	@ApiOperation(value = "Display Welcome to Swagger !!!!")
	@ApiResponses(value = { @ApiResponse(code = 101, message = "101 is the message"),
			@ApiResponse(code = 200, message = "Successful"), @ApiResponse(code = 404, message = "Page Not Found!!!") })
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome to Swagger !!!!";
	}
	
	@ApiOperation(value = "Display Welcome to ADD !!!")
	@GetMapping("/add") 
	public String getAdd() {
		return "Welcome to ADD !!!";
	}
	
	@ApiOperation(value = "Returns String Data for Insert...")
	@PostMapping("/insert") 
	public String getPost(@RequestBody final String data) {
		return data;
	}
	
	@ApiOperation(value = "Returns String Data for Update..")
	@PutMapping("/update") 
	public String getUpdate(@RequestBody final String data) {
		return data;
	}
	
	@ApiOperation(value = "Returns String Data for Delete...")
	@DeleteMapping("/delete")
	public String getDelete() {
		return "Welcome to DELETE !!!!";
	}
}
