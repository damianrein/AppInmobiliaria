package com.AppInmobiliaria.entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Rent extends Contract{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate endDate;
	@OneToMany
	private Set<RentPayments> pay;
	
	public Rent(LocalDate creationDate, Property property, Client client, Long id, LocalDate endDate,
			Set<RentPayments> pay) {
		super(creationDate, property, client);
		this.id = id;
		this.endDate = endDate;
		this.pay = pay;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Set<RentPayments> getPay() {
		return pay;
	}
	public void setPay(RentPayments pay) {
		this.pay.add(pay);
	}
	public Long getId() {
		return id;
	}
}
