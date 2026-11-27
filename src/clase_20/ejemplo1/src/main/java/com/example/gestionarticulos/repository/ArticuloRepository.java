package com.example.gestionarticulos.repository;

import com.example.gestionarticulos.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
}
