package com.AppInmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AppInmobiliaria.entities.RealStateUser;

@Repository
public interface IRealStateUserRepository extends JpaRepository<RealStateUser, Long>{

}
