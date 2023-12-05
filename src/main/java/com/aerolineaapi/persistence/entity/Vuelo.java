
package com.aerolineaapi.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Vuelos")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo")
    private Integer idVuelo;

    private String disponibilidad;
    
    @Column(name = "tipo_vuelo")
    private String tipoVuelo;

    @Column(name = "avion_codigo_fk")
    private Integer avionCodigoFk;

    @Column(name = "id_destino_fk")
    private Integer idDestinoFk;

    @ManyToOne
    @JoinColumn(name = "avion_codigo_fk", insertable = false, updatable = false)
    private Avion avion;
    
    @ManyToOne
    @JoinColumn(name = "id_destino_fk", insertable = false, updatable = false)
    private Destino destino;
        
}