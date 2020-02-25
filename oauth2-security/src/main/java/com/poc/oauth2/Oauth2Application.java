/**
 * 
 */
package com.poc.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Kaushal
 *
 */
@SpringBootApplication(scanBasePackages = "com.poc.oauth2")
public class Oauth2Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		SpringApplication.run(Oauth2Application.class, args);
	}

}
