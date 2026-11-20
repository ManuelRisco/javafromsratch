package com.example.decolecta.controller;

import com.example.decolecta.dto.PersonaReniec;
import com.example.decolecta.service.ReniecService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reniec")
public class ReniecController {

    private final ReniecService reniecService;

    public ReniecController(ReniecService reniecService) {
        this.reniecService = reniecService;
    }

    @GetMapping("/{dni}")
    public PersonaReniec consultarDni(@PathVariable String dni) {

        if (!dni.matches("\\d{8}")) {
            throw new IllegalArgumentException("El DNI debe tener 8 digigos");
        }

        return reniecService.consultarDni(dni);
    }
}
