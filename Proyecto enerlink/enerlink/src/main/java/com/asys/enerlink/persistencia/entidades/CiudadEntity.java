package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Ciudad")
@Getter
@Setter
@NoArgsConstructor
public class CiudadEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id ciudad")
        private long id;

        private String nombre;

        @ManyToOne
        @JoinColumn(name = "id_departamento")
        private DepartamentoEntity departamento;

        @OneToMany(mappedBy = "ciudad")
        private List<ClienteEntity> cliente;

}
