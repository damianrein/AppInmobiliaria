package com.AppInmobiliaria.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.AppInmobiliaria.repositories.IRealStateUserRepository;

@Configuration
public class ApplicationConfig {

	private IRealStateUserRepository repo;
	
	public ApplicationConfig(IRealStateUserRepository repo) {
		this.repo = repo;
	}

	@Bean
	UserDetailsService userDetailsService() {
		return u->repo.findByEmail(u).get();
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	AuthenticationManager authManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
	@Bean
	AuthenticationProvider authProvider() {
		DaoAuthenticationProvider daoAuth = new DaoAuthenticationProvider();
		daoAuth.setUserDetailsService(null);
		daoAuth.setPasswordEncoder(passwordEncoder());
		return daoAuth;
	}
}
