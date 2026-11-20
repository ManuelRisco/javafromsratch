package com.example.nubefact.controller;

import com.example.nubefact.dto.BoletaRequest;
import com.example.nubefact.dto.NubeFactResponse;
import com.example.nubefact.service.NubeFactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nubefact")
public class NubeFactController {

    private final NubeFactService nubeFactService;

    public NubeFactController(NubeFactService nubeFactService) {
        this.nubeFactService = nubeFactService;
    }

    @PostMapping("/boletas")
    public NubeFactResponse emitirBoleta(
            @RequestBody BoletaRequest boleta
    ) {
        return nubeFactService.emitirBoleta(boleta);
    }
}