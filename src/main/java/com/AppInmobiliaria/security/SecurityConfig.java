package com.AppInmobiliaria.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	
	
	
	
	
	
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		
		
		
		return http.build();
	}
}