package com.AppInmobiliaria.services;

import org.springframework.stereotype.Service;

import com.AppInmobiliaria.entities.Client;
import com.AppInmobiliaria.repositories.IClientRepository;

@Service
public class ClientService {

	private IClientRepository repo;
	
	public void addNewClient(Client client) {
		repo.save(client);
	}
}
