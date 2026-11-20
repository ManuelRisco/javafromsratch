package com.example.decolecta.dto;

public record EmpresaSunat(
        String razon_social,
        String estado,
        String condicion,
        String direccion,
        String ubigeo,
        String via_tipo,
        String via_nombre,
        String zona_codigo,
        String zona_tipo,
        String numero,
        String interior,
        String distrito,
        String provincia,
        String departamento,
        String numero_documento
) {
}
