package com.AppInmobiliaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppInmobiliaria.entities.Client;
import com.AppInmobiliaria.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	private ClientService cservice;

	public ClientController(@Autowired ClientService cservice) {
		this.cservice = cservice;
	}
	
	@GetMapping("/")
	public ResponseEntity<?> saveNewClient(@RequestBody Client client){
		cservice.addNewClient(client);
		return ResponseEntity.ok().build();
	}
}
