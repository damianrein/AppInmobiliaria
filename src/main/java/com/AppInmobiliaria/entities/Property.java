package com.AppInmobiliaria.entities;

import java.util.Set;

import com.AppInmobiliaria.enums.PropertyState;
import com.AppInmobiliaria.enums.TipoPropiedad;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
De cada propiedad se registrara: el tipo (casa, departamento, local comercial, etc.), la ciudad en la
que está, la cantidad cuadrados del terreno y cubiertos, la cantidad de ambientes, de habitaciones, de
baños, si posee o no cochera, quincho, parrilla o pileta, la dirección y el barrio, así como también
registrar el monto de alquiler y/o de venta, según corresponda.
*/
@Entity
public class Property {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private TipoPropiedad tipo;
	private String ciudad;
	private String metros2;
	private String metros2cubiertos;
	private short ambientes;
	private short habitaciones;
	private short banios;
	private boolean cochera;
	private boolean quincho;
	private boolean parrilla;
	private boolean pileta;
	private String direccion;
	private String barrio;
	private Contract contrato;
	@Enumerated(EnumType.ORDINAL)
	private PropertyState state;
	private Set<Visit> visits;
}
