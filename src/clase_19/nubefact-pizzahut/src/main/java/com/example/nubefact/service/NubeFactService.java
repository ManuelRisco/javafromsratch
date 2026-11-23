package com.example.nubefact.service;

import com.example.nubefact.dto.BoletaRequest;
import com.example.nubefact.dto.NubeFactResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class NubeFactService {

    private final RestClient restClient;
    private final String ruta;

    public NubeFactService(
            @Value("${nubefact.api.url}") String ruta,
            @Value("${nubefact.api.token}") String token
    ) {

        this.ruta = ruta;

        this.restClient = RestClient.builder()
                .defaultHeader("Authorization", token)
                .defaultHeader("Accept", "application/json")
                .build();
    }

    public NubeFactResponse emitirBoleta(BoletaRequest boleta) {

        return restClient.post()
                .uri(ruta)
                .contentType(MediaType.APPLICATION_JSON)
                .body(boleta)
                .retrieve()
                .body(NubeFactResponse.class);
    }
}
