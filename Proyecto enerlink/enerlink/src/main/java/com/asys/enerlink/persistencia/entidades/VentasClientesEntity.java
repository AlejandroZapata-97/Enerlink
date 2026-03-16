package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity
    @Table(name = "Ventas_Clientes")
    @Getter
    @Setter
    @NoArgsConstructor
    public class VentasClientesEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id ventas_Clientes")
        private long id;

        private Integer cantidad;

    }

