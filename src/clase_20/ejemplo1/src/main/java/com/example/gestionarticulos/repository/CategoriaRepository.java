package com.example.gestionarticulos.repository;

import com.example.gestionarticulos.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
