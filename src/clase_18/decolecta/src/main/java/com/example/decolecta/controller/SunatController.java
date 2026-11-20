package com.example.decolecta.controller;

import com.example.decolecta.dto.EmpresaSunat;
import com.example.decolecta.service.SunatService;
import com.example.decolecta.service.ReniecService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sunat")
public class SunatController {

    private final SunatService sunatService;

    public SunatController(SunatService sunatService, ReniecService reniecService) {
        this.sunatService = sunatService;
    }

    @GetMapping("/{ruc}")
    public EmpresaSunat consultarRuc(@PathVariable String ruc) {

        if (!ruc.matches("\\d{11}")) {
            throw new IllegalArgumentException("El RUC debe tener 11 digigos");
        }

        return sunatService.consultarRuc(ruc);
    }
}