package com.AppInmobiliaria.entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
/*
Cuando se alquila una propiedad se realiza un contrato, indicando, datos de la propiedad, cliente
que alquila, fecha de inicio y de fin del contrato, monto mensual de alquiler, y fecha de fin, tenga en
cuenta que se puede cancelar el contrato antes que se venza, asimismo se registrarán los pagos
mensuales recibidos, indicando mes, año y monto abonado.

*/
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
