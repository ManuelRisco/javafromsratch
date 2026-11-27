package com.example.gestionarticulos.service;

import com.example.gestionarticulos.dto.ArticuloRequest;
import com.example.gestionarticulos.dto.ArticuloResponse;
import com.example.gestionarticulos.entity.Articulo;
import com.example.gestionarticulos.entity.Categoria;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import com.example.gestionarticulos.repository.ArticuloRepository;
import com.example.gestionarticulos.repository.CategoriaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticuloService {

    private final ArticuloRepository articuloRepository;
    private final CategoriaRepository categoriaRepository;

    // Listar articulos
    @Transactional(readOnly = true)
    public List<ArticuloResponse> listar() {

        return articuloRepository.findAll()
                .stream()
                .map(this::convertir)
                .toList();
    }

    // Buscar articulo por ID
    @Transactional(readOnly = true)
    public ArticuloResponse obtener(Integer id){

        Articulo articulo = buscarEntidad(id);

        return convertir(articulo);
    }

    //Registrar articulo
    public ArticuloResponse registrar(ArticuloRequest request) {

        Articulo articulo = new Articulo();

        asignarDatos(articulo, request);

        Articulo guardado = articuloRepository.save(articulo);

        return convertir(guardado);
    }

    // Actualizar articulo
    public ArticuloResponse actualizar(Integer id, ArticuloRequest request) {
        Articulo articulo = buscarEntidad(id);

        asignarDatos(articulo, request);

        return convertir(articuloRepository.save(articulo));
    }

    // Eliminar articulo
    public void eliminar(Integer id) {

        Articulo articulo = buscarEntidad(id);

        articuloRepository.delete(articulo);
    }

    // Buscar entidad
    private Articulo buscarEntidad(Integer id) {

        return articuloRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Articulo no encontrado"
                        )
                );
    }

    // Asignar datos del DTO a la entidad
    private void asignarDatos(Articulo articulo, ArticuloRequest request) {
        articulo.setNombre(request.nombre());

        if (request.categoriaId() == null) {
            articulo.setCategoria(null);
        } else {

            Categoria categoria = categoriaRepository
                    .findById(request.categoriaId())
                    .orElseThrow(() ->
                            new ResponseStatusException(
                                    HttpStatus.NOT_FOUND,
                                    "Categoria no encontrada"
                            )
                    );

            articulo.setCategoria(categoria);
        }

        articulo.setStock(
                request.stock() != null ? request.stock() : 0
        );

        articulo.setStockMinimo(
                request.stockMinimo() != null ? request.stockMinimo() : 0
        );

        articulo.setBandStock(
                request.bandStock() != null && request.bandStock()
        );

        articulo.setBandStock(
                request.bandCorreo() != null && request.bandCorreo()
        );
    }

    // Convertir entidad a DTO
    private ArticuloResponse convertir(Articulo articulo) {

        Categoria categoria = articulo.getCategoria();

        return new ArticuloResponse(
                articulo.getId(),
                articulo.getNombre(),
                categoria != null ? categoria.getId() : null,
                categoria != null ? categoria.getNombre() : null,
                articulo.getStock(),
                articulo.getStockMinimo(),
                articulo.getBandStock(),
                articulo.getBandCorreo()
        );
    }
}
