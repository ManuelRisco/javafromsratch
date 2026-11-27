package com.example.gestionarticulos.service;

import com.example.gestionarticulos.dto.CategoriaRequest;
import com.example.gestionarticulos.dto.CategoriaResponse;
import com.example.gestionarticulos.entity.Categoria;
import com.example.gestionarticulos.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Locale;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    // Listar Categorias
    @Transactional(readOnly = true)
    public List<CategoriaResponse> listar() {

        return categoriaRepository.findAll()
                .stream()
                .map(this::convertir)
                .toList();
    }

    // Buscar categoria por ID
    @Transactional(readOnly = true)
    public CategoriaResponse obtener(Integer id){

        Categoria categoria = buscarEntidad(id);

        return convertir(categoria);
    }

    //Registrar categoria
    public CategoriaResponse registrar(CategoriaRequest request) {

        Categoria categoria = new Categoria();

        asignarDatos(categoria, request);

        Categoria guardado = categoriaRepository.save(categoria);

        return convertir(guardado);
    }

    // Actualizar categoria
    public CategoriaResponse actualizar(Integer id, CategoriaRequest request) {
        Categoria categoria = buscarEntidad(id);

        asignarDatos(categoria, request);

        return convertir(categoriaRepository.save(categoria));
    }

    // Eliminar categoria
    public void eliminar(Integer id) {

        Categoria categoria = buscarEntidad(id);

        categoriaRepository.delete(categoria);
    }

    // Buscar entidad
    private Categoria buscarEntidad(Integer id) {

        return categoriaRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Categoria no encontrado"
                        )
                );
    }

    // Asignar datos del DTO a la entidad
    private void asignarDatos(Categoria categoria, CategoriaRequest request) {
        categoria.setNombre(request.nombre().toUpperCase(Locale.ROOT));
    }

    // Convertir entidad a DTO
    private CategoriaResponse convertir(Categoria categoria) {

        return new CategoriaResponse(
                categoria.getId(),
                categoria.getNombre()
        );
    }
}