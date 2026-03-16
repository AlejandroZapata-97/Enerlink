package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import java.util.List;

@Entity
    @Table(name = "Departamento")
    @Getter
    @Setter
    @NoArgsConstructor
    public class DepartamentoEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id departamento")
        private long id;

        private String nombre;

        @ManyToOne
        @JoinColumn (name = "id_pais")
        private PaisEntity pais;

        @OneToMany(mappedBy = "departamento")
        private List<CiudadEntity> ciudad;
}
