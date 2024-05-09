package com.AppInmobiliaria.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private AuthenticationProvider authPro;
	
	private JwtAuthenticationFilter jwtFilter;
	
	public SecurityConfig(@Autowired AuthenticationProvider authPro,@Autowired JwtAuthenticationFilter jwtFilter) {
		this.authPro = authPro;
		this.jwtFilter = jwtFilter;
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		return	http.csrf(c->c.disable())
		.authorizeHttpRequests(au->{au.requestMatchers("/client").permitAll();
		au.anyRequest().authenticated();})
		.sessionManagement(session->{session.sessionCreationPolicy(SessionCreationPolicy.STATELESS);})
		.authenticationProvider(authPro)
		.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
		.build()
		;
	}
}
