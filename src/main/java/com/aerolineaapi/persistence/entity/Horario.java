package com.aerolineaapi.persistence.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "horarios")
public class Horario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    Integer idHorario;

    @Column(name = "hora_vuelo")
    String horaVuelo;

    @OneToMany(mappedBy = "horario")
    private List<Destino> destinos;

}
