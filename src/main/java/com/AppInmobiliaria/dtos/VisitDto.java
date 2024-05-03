package com.AppInmobiliaria.dtos;

import java.time.LocalDate;

public record VisitDto(Long propertyId, Long clientId, LocalDate visitDate, String opinion) {

}
