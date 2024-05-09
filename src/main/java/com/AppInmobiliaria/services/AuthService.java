package com.AppInmobiliaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.AppInmobiliaria.dtos.LoginUsuario;
import com.AppInmobiliaria.entities.RealStateUser;
import com.AppInmobiliaria.repositories.IRealStateUserRepository;

public class AuthService {

	private IRealStateUserRepository repo;

	private AuthenticationManager authenticationManager;

	public AuthService(@Autowired IRealStateUserRepository repo,
			@Autowired AuthenticationManager authenticationManager) {
		this.repo = repo;
		this.authenticationManager = authenticationManager;
	}
	
	public RealStateUser loguearse(LoginUsuario user) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.email(), user.password()));
		
		return repo.findByEmail(user.email()).orElseThrow();
	}
}
