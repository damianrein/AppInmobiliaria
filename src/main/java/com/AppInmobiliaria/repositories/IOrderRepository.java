package com.AppInmobiliaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AppInmobiliaria.entities.Order;

public interface IOrderRepository extends JpaRepository<Order, Long>{

	
}
