
package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class DefaultSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefaultSecurityApplication.class, args);
	}

}
