package com.example.gestionarticulos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record ArticuloRequest(
        @NotBlank
        @Size(max = 100)
        String nombre,

        Integer categoriaId,

        @PositiveOrZero
        Integer stock,

        @PositiveOrZero
        Integer stockMinimo,

        Boolean bandStock,

        Boolean bandCorreo
) {
}
