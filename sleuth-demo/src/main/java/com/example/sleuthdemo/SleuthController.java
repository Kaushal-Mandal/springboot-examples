package com.example.sleuthdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/sleuth/demo")
public class SleuthController {

	private static Logger logger = LoggerFactory.getLogger(SleuthController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/client")
	public String getData() {
		
		logger.info("Before calling the server!!!");
		String response = restTemplate.getForObject("http://localhost:9091/sleuth/demo/server", String.class);
		logger.info("After calling the server !!!!");
		return response;
	}
}
