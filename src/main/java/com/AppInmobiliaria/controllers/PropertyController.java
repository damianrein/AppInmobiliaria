package com.AppInmobiliaria.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AppInmobiliaria.entities.Property;
import com.AppInmobiliaria.services.PropertyService;

@RestController
@RequestMapping("/v1")
public class PropertyController {

	private PropertyService service;

	public PropertyController(PropertyService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Property>> getAllProperties(){
		return ResponseEntity.ok(service.findAllProperties());
	}
}
