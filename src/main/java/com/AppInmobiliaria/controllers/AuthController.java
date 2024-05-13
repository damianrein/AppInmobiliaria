package com.AppInmobiliaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppInmobiliaria.dtos.LoginResponse;
import com.AppInmobiliaria.dtos.LoginUsuario;
import com.AppInmobiliaria.entities.RealStateUser;
import com.AppInmobiliaria.services.AuthService;
import com.AppInmobiliaria.services.JwtService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private AuthService authServices;
	
	private JwtService jwtService;

	public AuthController(@Autowired AuthService authServices,@Autowired JwtService jwtService) {
		this.authServices = authServices;
		this.jwtService = jwtService;
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginUsuario user){
		RealStateUser usuario = authServices.loguearse(user);
		String token = jwtService.generateToken(usuario);
		
		LoginResponse response = new LoginResponse(token,jwtService.getExpirationTime());
		return ResponseEntity.ok(response);
	}
}
