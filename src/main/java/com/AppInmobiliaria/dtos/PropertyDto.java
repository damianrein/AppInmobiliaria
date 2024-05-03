package com.AppInmobiliaria.dtos;

import com.AppInmobiliaria.enums.PropertyState;
import com.AppInmobiliaria.enums.TipoPropiedad;

public record PropertyDto(TipoPropiedad tipo, String ciudad, String metros2, String metros2cubiertos,
		short ambientes, short habitaciones, short banios, boolean cochera, boolean quincho, boolean parrilla,
		boolean pileta, String direccion, String barrio, PropertyState state) {

}
