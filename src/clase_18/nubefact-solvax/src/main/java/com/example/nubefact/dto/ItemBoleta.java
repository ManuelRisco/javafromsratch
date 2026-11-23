package com.example.nubefact.dto;

import java.math.BigDecimal;

public record ItemBoleta(
        String unidad_de_medida,
        String codigo,
        String descripcion,
        BigDecimal cantidad,
        BigDecimal valor_unitario,
        BigDecimal precio_unitario,
        BigDecimal subtotal,
        Integer tipo_de_igv,
        BigDecimal igv,
        BigDecimal total,
        Boolean anticipo_regularizacion
) {
}