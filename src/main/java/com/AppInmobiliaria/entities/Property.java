package com.AppInmobiliaria.entities;

import java.util.Set;

import com.AppInmobiliaria.dtos.PropertyDto;
import com.AppInmobiliaria.enums.PropertyState;
import com.AppInmobiliaria.enums.TipoPropiedad;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

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
	@OneToMany
	private Set<Visit> visits;
	@NotBlank
	private String [] urlsFotos;
	
	public Property() {}
	
	public Property(Long id, TipoPropiedad tipo, String ciudad, String metros2, String metros2cubiertos,
			short ambientes, short habitaciones, short banios, boolean cochera, boolean quincho, boolean parrilla,
			boolean pileta, String direccion, String barrio, Contract contrato, PropertyState state,
			Set<Visit> visits) {
		this.id = id;
		this.tipo = tipo;
		this.ciudad = ciudad;
		this.metros2 = metros2;
		this.metros2cubiertos = metros2cubiertos;
		this.ambientes = ambientes;
		this.habitaciones = habitaciones;
		this.banios = banios;
		this.cochera = cochera;
		this.quincho = quincho;
		this.parrilla = parrilla;
		this.pileta = pileta;
		this.direccion = direccion;
		this.barrio = barrio;
		this.contrato = contrato;
		this.state = state;
		this.visits = visits;
	}
	public Property(PropertyDto dto) {
		this.tipo = dto.tipo();
		this.ciudad = dto.ciudad();
		this.metros2 = dto.metros2();
		this.metros2cubiertos = dto.metros2cubiertos();
		this.ambientes = dto.ambientes();
		this.habitaciones = dto.habitaciones();
		this.banios = dto.banios();
		this.cochera = dto.cochera();
		this.quincho = dto.quincho();
		this.parrilla = dto.parrilla();
		this.pileta = dto.pileta();
		this.direccion = dto.direccion();
		this.barrio = dto.barrio();
		this.state = dto.state();
	}
//----------------------------------------------------------------------------------------------------------------------------------------------
	public TipoPropiedad getTipo() {
		return tipo;
	}
	public void setTipo(TipoPropiedad tipo) {
		this.tipo = tipo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getMetros2() {
		return metros2;
	}
	public void setMetros2(String metros2) {
		this.metros2 = metros2;
	}
	public String getMetros2cubiertos() {
		return metros2cubiertos;
	}
	public void setMetros2cubiertos(String metros2cubiertos) {
		this.metros2cubiertos = metros2cubiertos;
	}
	public short getAmbientes() {
		return ambientes;
	}
	public void setAmbientes(short ambientes) {
		this.ambientes = ambientes;
	}
	public short getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(short habitaciones) {
		this.habitaciones = habitaciones;
	}
	public short getBanios() {
		return banios;
	}
	public void setBanios(short banios) {
		this.banios = banios;
	}
	public boolean isCochera() {
		return cochera;
	}
	public void setCochera(boolean cochera) {
		this.cochera = cochera;
	}
	public boolean isQuincho() {
		return quincho;
	}
	public void setQuincho(boolean quincho) {
		this.quincho = quincho;
	}
	public boolean isParrilla() {
		return parrilla;
	}
	public void setParrilla(boolean parrilla) {
		this.parrilla = parrilla;
	}
	public boolean isPileta() {
		return pileta;
	}
	public void setPileta(boolean pileta) {
		this.pileta = pileta;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public Contract getContrato() {
		return contrato;
	}
	public void setContrato(Contract contrato) {
		this.contrato = contrato;
	}
	public PropertyState getState() {
		return state;
	}
	public void setState(PropertyState state) {
		this.state = state;
	}
	public Set<Visit> getVisits() {
		return visits;
	}
	public void setVisits(Visit visits) {
		this.visits.add(visits);
	}
	public Long getId() {
		return id;
	}
}
