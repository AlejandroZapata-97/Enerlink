package com.asys.enerlink.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yaml.snakeyaml.tokens.AliasToken;

import java.util.List;

@Entity
@Table(name = "Clientes")
@Getter
@Setter
@NoArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id cliente")
    private long id;

    private String nombre;
    private String direccion;
    private Integer telefono;
    private String email;



    @OneToMany
    private List<ContratosEntity> contratos;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private CiudadEntity ciudad;

    @OneToMany(mappedBy = "cliente")
    private List<ContratosEntity> contrato;

    @ManyToMany
    @JoinTable(name = "ventas_clientes",
    joinColumns = @JoinColumn(name = "id_cliente"),
    inverseJoinColumns = @JoinColumn(name = "id_venta"))
    private List<VentasEntity> ventas;

}
