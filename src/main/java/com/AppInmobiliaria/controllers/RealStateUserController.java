package com.AppInmobiliaria.controllers;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppInmobiliaria.dtos.LoginResponse;
import com.AppInmobiliaria.dtos.LoginUsuario;
import com.AppInmobiliaria.entities.RealStateUser;
import com.AppInmobiliaria.services.AuthService;
import com.AppInmobiliaria.services.JwtService;
import com.AppInmobiliaria.services.RealStateUserService;

@RestController
@RequestMapping("/v0")
public class RealStateUserController {

	private RealStateUserService services;
	
	private AuthService authServices;
	
	private JwtService jwtService;
	
	public RealStateUserController(RealStateUserService services) {
		this.services = services;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginUsuario user){
		RealStateUser usuario = authServices.loguearse(user);
		String token = jwtService.generateToken(usuario);
		
		LoginResponse response = new LoginResponse(token,jwtService.getExpirationTime());
		return ResponseEntity.ok(response);
	}

	@PostMapping("/")
	public ResponseEntity<?> addNewUser(@RequestBody RealStateUser user){
		services.createUser(user);
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
	}

	@GetMapping("/")
	public ResponseEntity<List<RealStateUser>> findAllUsers(){
		
		return ResponseEntity.ok(services.findAllRealStateUser());
	}
}
