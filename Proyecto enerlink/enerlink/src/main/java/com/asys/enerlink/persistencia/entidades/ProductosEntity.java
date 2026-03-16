package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
    @Table(name = "Productos")
    @Getter
    @Setter
    @NoArgsConstructor
    public class ProductosEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id producto")
        private long id;

        private String nombre;
        private Integer precio;
        private Integer cantidad;

        @OneToMany
        @JoinColumn(name = "id_plantas_solares")
        private List<PlantasSolaresEntity> plantasSolares;

        @ManyToOne
        @JoinColumn(name = "id_planta")
        private PlantasSolaresEntity planta;

        @ManyToMany(mappedBy = "productos")
        private List<VentasEntity> ventas;

    }
