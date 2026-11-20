package com.example.decolecta.service;

import com.example.decolecta.dto.PersonaReniec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ReniecService {

    private final RestClient restClient;

    public ReniecService(
            @Value("${decolecta.api.token}") String token
    ) {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.decolecta.com/v1")
                .defaultHeader("Authorization", "Bearer " + token)
                .defaultHeader("Accept", "application/json")
                .build();
    }

    public PersonaReniec consultarDni(String dni) {

        return restClient.get()
                .uri("/reniec/dni?numero={dni}", dni)
                .retrieve()
                .body(PersonaReniec.class);
    }
}
