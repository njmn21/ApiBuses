package com.ApiBuses.ApiBuses.presentation.DTO;

import java.util.Date;

public record BusDTO (
        Long id,
        Long numeroBus,
        String placa,
        Date fechaCreacion,
        String caracteristicas,
        String marca,
        Boolean estado
){
}
