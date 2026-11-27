package com.example.gestionarticulos.controller;

import com.example.gestionarticulos.dto.CategoriaRequest;
import com.example.gestionarticulos.dto.CategoriaResponse;
import com.example.gestionarticulos.service.CategoriaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaResponse> listar() {
        return categoriaService.listar();
    }

    @GetMapping("/{id}")
    public CategoriaResponse obtener(@PathVariable Integer id) {
        return categoriaService.obtener(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaResponse registrar(
            @Valid @RequestBody CategoriaRequest request) {
        return categoriaService.registrar(request);
    }

    @PutMapping("/{id}")
    public CategoriaResponse actualizar(
            @PathVariable Integer id,
            @Valid @RequestBody CategoriaRequest request) {
        return  categoriaService.actualizar(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Integer id) {
        categoriaService.eliminar(id);
    }
}
