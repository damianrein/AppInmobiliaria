package com.AppInmobiliaria.entities;

import java.time.LocalDate;

public abstract class Contract {
	private LocalDate creationDate;
	private Property property;
	private Client client;

	public Contract(){}
	
	public Contract(LocalDate creationDate, Property property, Client client) {
		this.creationDate = creationDate;
		this.property = property;
		this.client = client;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate date) {
		this.creationDate = date;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
}
