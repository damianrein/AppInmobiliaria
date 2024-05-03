package com.AppInmobiliaria.entities;
/*
Se llevará un registro de las visitas de los clientes, indicando la fecha y la opinión del mismo
respecto de la propiedad.
*/

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Visit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Client client;
	private LocalDate visitDate;
	private String opinion;
	
	public Visit() {}
	
	public Visit(Long id, Client client, LocalDate visitDate, String opinion) {
		this.id = id;
		this.client = client;
		this.visitDate = visitDate;
		this.opinion = opinion;
	}

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public LocalDate getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public Long getId() {
		return id;
	}
}
