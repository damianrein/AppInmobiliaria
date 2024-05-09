package com.AppInmobiliaria.controllers;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppInmobiliaria.entities.RealStateUser;
import com.AppInmobiliaria.services.RealStateUserService;

@RestController
@RequestMapping("/v0")
public class RealStateUserController {

	private RealStateUserService services;
	
	public RealStateUserController(RealStateUserService services) {
		this.services = services;
	}

	public ResponseEntity<?> addNewUser(@RequestBody RealStateUser user){
		services.createUser(user);
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
	}

	public ResponseEntity<List<RealStateUser>> findAllUsers(){
		
		return ResponseEntity.ok(services.findAllRealStateUser());
	}
}
