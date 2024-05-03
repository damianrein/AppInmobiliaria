package com.AppInmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.AppInmobiliaria.entities.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {

}
