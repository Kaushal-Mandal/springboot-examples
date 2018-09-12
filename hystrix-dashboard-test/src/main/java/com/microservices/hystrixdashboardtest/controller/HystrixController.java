package com.microservices.hystrixdashboardtest.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {
	
	@HystrixCommand(fallbackMethod = "fallBackWelcome", commandKey = "welcome", groupKey = "welcome")
	@GetMapping("/welcome")
	public String getEmp() {
		if(RandomUtils.nextBoolean()) {
			throw new RuntimeException("Failed!!!");
		}
		return "Hi, Welcome to Hystrix!!!";
	}
	
	public String fallBackWelcome() {
		return "Fall Back Welcome Failed !!!!";
	}
}
