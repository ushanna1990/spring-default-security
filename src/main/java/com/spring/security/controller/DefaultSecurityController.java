package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultSecurityController {
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Login successfully";
	}

}
