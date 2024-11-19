package com.ApiBuses.ApiBuses.presentation.DTO;

import java.time.LocalDate;
import java.util.Date;

public record BusDTO (
        Long id,
        Long numeroBus,
        String placa,
        LocalDate fechaCreacion,
        String caracteristicas,
        String marca,
        Boolean estado
){
}
