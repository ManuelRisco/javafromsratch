package com.example.nubefact.dto;

import java.math.BigDecimal;
import java.util.List;

public record BoletaRequest(
        String operacion,
        Integer tipo_de_comprobante,
        String serie,
        Integer numero,
        Integer sunat_transaction,
        String cliente_tipo_de_documento,
        String cliente_numero_de_documento,
        String cliente_denominacion,
        String cliente_direccion,
        String fecha_de_emision,
        Integer moneda,
        BigDecimal porcentaje_de_igv,
        BigDecimal total_gravada,
        BigDecimal total_igv,
        BigDecimal total,
        Boolean enviar_automaticamente_a_la_sunat,
        Boolean enviar_automaticamente_al_cliente,
        List<ItemBoleta> items
) {
}