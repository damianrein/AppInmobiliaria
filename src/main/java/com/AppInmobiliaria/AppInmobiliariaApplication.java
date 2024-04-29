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

Se llevará un registro de las visitas de los clientes, indicando la fecha y la opinión del mismo
respecto de la propiedad.

Se llevará asimismo un registro de los pedidos de los clientes, a los fines de poder ofrecerles las
propiedades que posee la inmobiliaria, se registrará la fecha del pedido, el tipo de propiedad
buscada, si es para alquiler o compra, cantidad de habitaciones, preferencias de barrios, indicando
además si el pedido está o no vigente.

Cuando se alquila una propiedad se realiza un contrato, indicando, datos de la propiedad, cliente
que alquila, fecha de inicio y de fin del contrato, monto mensual de alquiler, y fecha de fin, tenga en
cuenta que se puede cancelar el contrato antes que se venza, asimismo se registrarán los pagos
mensuales recibidos, indicando mes, año y monto abonado.

Si es una venta, se registra, fecha, datos del comprador, de la propiedad, forma de pago y valor
abonado.

Se pide:
- Listar todas las propiedades en alquiler de una ciudad dada.
- Todas las casa quinta con piletas.
- Dado un cliente, todas las propiedades que posee.
- Datos de los clientes que deban más de un mes de alquiler.
- Contratos realizados durante febrero de 2024.
- Listar propiedades para alquilar en un rango de montos.


*/