package com.aerolineaapi.persistence.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Avion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    private String marca;
    private String estado;

    @OneToMany(mappedBy = "avion")
    private List<Vuelo> vuelos;
    
}
