package com.AppInmobiliaria.entities;
/*
Se llevará un registro de las visitas de los clientes, indicando la fecha y la opinión del mismo
respecto de la propiedad.
*/

import java.time.LocalDate;

public class Visit {

	private Long id;
	private Client client;
	private LocalDate visitDate;
	private String opinion;
}
