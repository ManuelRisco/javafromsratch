package com.example.gestionarticulos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ARTICULOS")
@Getter
@Setter
@NoArgsConstructor
public class Articulo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORIA_ID")
    private Categoria categoria;

    @Column(name = "STOCK", nullable = false)
    private Integer stock = 0;

    @Column(name = "STOCKMINIMO", nullable = false)
    private Integer stockMinimo;

    @Column(name = "BANDSTOCK", nullable = false)
    private Boolean bandStock = false;

    @Column(name = "BANDCORREO", nullable = false)
    private Boolean bandCorreo = false;
}
