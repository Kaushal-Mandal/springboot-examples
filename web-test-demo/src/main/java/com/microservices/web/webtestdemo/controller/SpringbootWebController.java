package com.microservices.web.webtestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class SpringbootWebController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hi, Welcome to Spring Boot Sample Examples!!!!";
	}
}
