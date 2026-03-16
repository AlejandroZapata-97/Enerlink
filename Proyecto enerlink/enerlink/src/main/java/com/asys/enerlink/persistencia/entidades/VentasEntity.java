package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;
import java.util.List;

@Entity
    @Table(name = "Ventas")
    @Getter
    @Setter
    @NoArgsConstructor
    public class VentasEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id venta")
        private long id;

        private Date fecha;
        private Integer total;

        @ManyToOne
        @JoinColumn(name = "id_contrato")
        private ContratosEntity contratos;

        @ManyToMany
        @JoinTable(name = "ventas_productos",
        joinColumns = @JoinColumn(name = "id_ventas"),
        inverseJoinColumns = @JoinColumn(name = "id_productos"))
        private List<ProductosEntity> productos;

        @ManyToMany(mappedBy = "ventas")
        private List<ClienteEntity> clientes;

    }
