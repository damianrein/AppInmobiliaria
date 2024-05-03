package com.AppInmobiliaria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.AppInmobiliaria.entities.Contract;

@Repository
public interface IContractRepository extends JpaRepository<Contract, Long> {

	@Query("SELECT c FROM Contract WHERE MOUNTH(c.creationDate) = 2 AND YEAR(c.creationDate) = 2024")
	List<Contract> findDebClient();
}
