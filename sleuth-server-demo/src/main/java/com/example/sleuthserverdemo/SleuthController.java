package com.example.sleuthserverdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sleuth/demo")
public class SleuthController {

	private static final Logger logger = LoggerFactory.getLogger(SleuthController.class);
	
	@GetMapping(value="/server")
	public String getSleuthClient() {
		logger.info("Reached to the Sleuth Server !!!!!!");
		return "Hello Sleuth Server !!!!";
	}
}
