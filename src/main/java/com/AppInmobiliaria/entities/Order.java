package com.AppInmobiliaria.entities;
/*
Se llevará asimismo un registro de los pedidos de los clientes, a los fines de poder ofrecerles las
propiedades que posee la inmobiliaria, se registrará la fecha del pedido, el tipo de propiedad
buscada, si es para alquiler o compra, cantidad de habitaciones, preferencias de barrios, indicando
además si el pedido está o no vigente.
*/

import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;

import com.AppInmobiliaria.enums.TipoPropiedad;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Order {

	@CreatedDate
	private LocalDate date;
	@Enumerated(EnumType.STRING)
	private TipoPropiedad type;
	private boolean contracType;
	private byte rooms;
	private Set<String> neighborhoods;
	private boolean current;
}
