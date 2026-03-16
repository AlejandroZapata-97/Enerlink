package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
    @Table(name = "Paneles_Solares")
    @Getter
    @Setter
    @NoArgsConstructor
    public class PanelesSolaresEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_paneles_solares")
        private long id;

        private String modelo;
        private String estado;
        private Integer poteciaNominal;
        private Date fechaInstalacion;

        @ManyToOne
        @JoinColumn(name = "id_planta")
        private PlantasSolaresEntity plantasSolares;

    }
