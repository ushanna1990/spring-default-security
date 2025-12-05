package com.spring.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DefaultSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) {
		http.authorizeHttpRequests(auth-> auth.requestMatchers("/welcome").authenticated());
		http.formLogin(form-> form.defaultSuccessUrl("/welcome", true));
		return http.build();
	}

}
