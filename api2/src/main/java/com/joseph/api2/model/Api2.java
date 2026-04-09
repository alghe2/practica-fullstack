package com.joseph.api2.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Api2 {

    @NotNull(message = "El id es obligatorio")
    private Integer id;

    @NotBlank(message = "La descripción de la tarea es obligatoria")
    private String descripcion;
}