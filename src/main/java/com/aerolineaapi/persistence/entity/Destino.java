package com.aerolineaapi.persistence.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Destinos")
public class Destino {

    @Id
    @Column(name = "id_destino")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDestino;
    
    private String nombre;

    @Column(name = "id_horario_fk")
    private Integer idHorarioFk;

    @ManyToOne
    @JoinColumn(name = "id_horario_fk", insertable = false, updatable = false)
    private Horario horario;

    @OneToMany(mappedBy = "destino")
    private List<Vuelo> vuelos;
}
