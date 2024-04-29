package com.AppInmobiliaria.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sale extends Contract{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double amount;
	private String wayToPay;
	
	public Sale() {}
	
	public Sale(LocalDate creationDate, Property property, Client client, Long id, Double amount, String wayToPay) {
		super(creationDate, property, client);
		this.id = id;
		this.amount = amount;
		this.wayToPay = wayToPay;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getWayToPay() {
		return wayToPay;
	}
	public void setWayToPay(String wayToPay) {
		this.wayToPay = wayToPay;
	}
	public Long getId() {
		return id;
	}
}
