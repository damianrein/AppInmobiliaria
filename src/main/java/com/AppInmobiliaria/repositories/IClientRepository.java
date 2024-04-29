package com.AppInmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppInmobiliaria.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {

	
}
