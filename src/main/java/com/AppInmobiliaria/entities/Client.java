package com.AppInmobiliaria.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private Set<Property> propiedades;
	
	public Client(Long id, Set<Property> propiedades) {
		this.id = id;
		this.propiedades = propiedades;
	}
	
	public Client() {}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Property> getPropiedades() {
		return propiedades;
	}
	public void setPropiedades(Set<Property> propiedades) {
		this.propiedades = propiedades;
	}
}
