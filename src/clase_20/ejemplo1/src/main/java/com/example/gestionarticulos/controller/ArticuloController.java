package com.example.gestionarticulos.controller;

import com.example.gestionarticulos.dto.ArticuloRequest;
import com.example.gestionarticulos.dto.ArticuloResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.gestionarticulos.service.ArticuloService;

import java.util.List;

@RestController
@RequestMapping("/api/articulos")
@RequiredArgsConstructor
public class ArticuloController {

    private final ArticuloService articuloService;

    @GetMapping
    public List<ArticuloResponse> listar() {
        return articuloService.listar();
    }

    @GetMapping("/{id}")
    public ArticuloResponse obtener(@PathVariable Integer id) {
        return articuloService.obtener(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArticuloResponse registrar(
            @Valid @RequestBody ArticuloRequest request) {
        return articuloService.registrar(request);
    }

    @PutMapping("/{id}")
    public ArticuloResponse actualizar(
            @PathVariable Integer id,
            @Valid @RequestBody ArticuloRequest request) {
        return  articuloService.actualizar(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Integer id) {
        articuloService.eliminar(id);
    }
}
