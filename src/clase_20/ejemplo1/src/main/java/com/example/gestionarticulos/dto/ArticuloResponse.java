package com.example.gestionarticulos.dto;

public record ArticuloResponse(

        Integer id,
        String nombre,
        Integer categoriaId,
        String categoriaNombre,
        Integer stock,
        Integer stockMinimo,
        Boolean bandStock,
        Boolean bandCorreo
) {
}
