package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
    @Table(name = "Pais")
    @Getter
    @Setter
    @NoArgsConstructor
    public class PaisEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_pais")
        private long id;

        private String nombre;

        @OneToMany (mappedBy = "pais")
        private List<DepartamentoEntity> departamento;
}
