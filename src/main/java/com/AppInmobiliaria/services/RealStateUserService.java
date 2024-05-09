package com.AppInmobiliaria.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.AppInmobiliaria.entities.RealStateUser;
import com.AppInmobiliaria.repositories.IRealStateUserRepository;

@Service
public class RealStateUserService {

	private IRealStateUserRepository repo;

	public RealStateUserService(IRealStateUserRepository repo) {
		this.repo = repo;
	}
	
	public void createUser(RealStateUser user) {
		repo.save(user);
	}
	
	public List<RealStateUser> findAllRealStateUser (){
		return repo.findAll();
	}
}
