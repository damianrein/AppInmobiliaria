package com.AppInmobiliaria.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

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
		
		return	http.csrf(c->c.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
		.authorizeHttpRequests(au->{au.requestMatchers("/client").permitAll();
		au.anyRequest().authenticated();})
		.sessionManagement(session->{session.sessionCreationPolicy(SessionCreationPolicy.STATELESS);})
		.authenticationProvider(authPro)
		.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
		.build()
		;
	}
	
	@Bean
	CorsConfigurationSource configCors() {
		CorsConfiguration config = new CorsConfiguration();
			config.setAllowedOriginPatterns(List.of("http://localhost:4200"));
			config.setAllowedHeaders(List.of("Authorization", "Content-Type"));
			config.setAllowedMethods(List.of("POST","PUT","GET","DELETE"));
		
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}
}
