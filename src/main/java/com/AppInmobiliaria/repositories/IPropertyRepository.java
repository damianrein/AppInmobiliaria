package com.AppInmobiliaria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AppInmobiliaria.entities.Property;

@Repository
public interface IPropertyRepository extends JpaRepository<Property, Long>{

	@Query("SELECT * Property AS p WHERE p.ciudad := ciudad AND p.state := FOR_RENT")
	List<Property> findPropertyByContratoAndCiudad(@Param(value = "ciudad") String ciudad);
	
	@Query("SELECT * Property AS p WHERE p.tipo:=CASA_QUINTA AND p.pileta:= true")
	List<Property> findPropertyTipoAndPileta();
}
