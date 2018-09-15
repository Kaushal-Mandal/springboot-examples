package com.example.httpsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure/demo")
public class HttpsController {

	@GetMapping(value="/welcome")
	public String getData() {
		
		return "Welcome to HTTPS example !!!!!";
	}
}
