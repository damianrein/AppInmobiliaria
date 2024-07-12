package com.AppInmobiliaria.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.AppInmobiliaria.dtos.PropertyDto;
import com.AppInmobiliaria.entities.Property;
import com.AppInmobiliaria.repositories.IPropertyRepository;

@Service
public class PropertyService {

	private IPropertyRepository repo;

	public PropertyService(IPropertyRepository repo) {
		this.repo = repo;
	}

	public List<Property> findAllProperties(){
		return repo.findAll();
	}
	
	Property findPropertyId(Long id) {
		return repo.findById(id).get();
	}
	
	void createProperty(PropertyDto dto) {
		repo.save(new Property(dto));
	}
	
	void deletePropertyId(Long id) {
		repo.deleteById(id);
	}
	
	void addFotos(Long id,List<String> urlsFotos) {
		Property property = repo.findById(id).get();
		property.setUrlsFotos(urlsFotos);
	}
	
	void addFotos(Long id,String urlsFotos) {
		Property property = repo.findById(id).get();
		property.setUrlsFotos(urlsFotos);
	}
}
