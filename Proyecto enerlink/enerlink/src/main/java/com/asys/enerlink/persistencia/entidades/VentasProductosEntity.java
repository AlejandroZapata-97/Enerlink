package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Entity
    @Table(name = "Ventas_Productos")
    @Getter
    @Setter
    @NoArgsConstructor
    public class VentasProductosEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id ventas_productos")
        private long id;

    }
