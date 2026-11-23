package com.example.nubefact.dto;

public record NubeFactResponse(
        Integer tipo_de_comprobante,
        String serie,
        Integer numero,
        String enlace,
        String enlace_del_pdf,
        String enlace_del_xml,
        String enlace_del_cdr,
        Boolean aceptada_por_sunat,
        String sunat_description,
        String sunat_note,
        String sunat_responsecode,
        String sunat_soap_error
) {
}