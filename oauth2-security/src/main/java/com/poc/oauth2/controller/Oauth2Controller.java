package com.poc.oauth2.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
//@EnableOAuth2Client
//@EnableConfigurationProperties(Oauth2Controller.class)
public class Oauth2Controller {

	@GetMapping(value = "/oauth")
	public String getTransaction (Principal principal) {
		return "Welcome to OAuth2 Security Application !!!" + principal.getName();
	}
}
