package com.AppInmobiliaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppInmobiliariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppInmobiliariaApplication.class, args);
	}

}
/*

Una inmobiliaria, nos pide realizar una base de datos para registrar su actividad.
Posee distintas propiedades, en distintas ciudades, todas ellas de la provincia de Entre Ríos,
principalmente en Concepción del Uruguay, pero también posee en otras localidades del departamento y de la zona.

Las propiedades pueden estar para la venta, alquiler permanente o ambas.
Las propiedades pueden ser de distinto tipo: casa, departamento, PH, local comercial, campo, casa
quinta, cada una de ellas pertenece a un cliente, que la deja en consignación, tenga en cuenta que un
cliente puede poseer distintas propiedades, pero cada propiedad es de un cliente.

De cada propiedad se registrara: el tipo (casa, departamento, local comercial, etc.), la ciudad en la
que está, la cantidad cuadrados del terreno y cubiertos, la cantidad de ambientes, de habitaciones, de
baños, si posee o no cochera, quincho, parrilla o pileta, la dirección y el barrio, así como también
registrar el monto de alquiler y/o de venta, según corresponda.







Se pide:
- Listar todas las propiedades en alquiler de una ciudad dada.
- Todas las casa quinta con piletas.
- Dado un cliente, todas las propiedades que posee.
- Datos de los clientes que deban más de un mes de alquiler.
- Contratos realizados durante febrero de 2024.
- Listar propiedades para alquilar en un rango de montos.


*/