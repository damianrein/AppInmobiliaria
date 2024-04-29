package com.AppInmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppInmobiliaria.entities.Property;

public interface IPropertyRepository extends JpaRepository<Property, Long>{

	
}
