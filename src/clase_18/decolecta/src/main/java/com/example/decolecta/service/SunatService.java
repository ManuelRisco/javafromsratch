package com.example.decolecta.service;

import com.example.decolecta.dto.EmpresaSunat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class SunatService {

    private final RestClient restClient;

    public SunatService(
            @Value("${decolecta.api.token}") String token
    ) {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.decolecta.com/v1")
                .defaultHeader("Authorization", "Bearer " + token)
                .defaultHeader("Accept", "application/json")
                .build();
    }

    public EmpresaSunat consultarRuc(String ruc) {

        return restClient.get()
                .uri("/sunat/ruc?numero={ruc}", ruc)
                .retrieve()
                .body(EmpresaSunat.class);
    }
}
