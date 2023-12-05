package com.aerolineaapi.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cedula;
    
    private String nombre;
    private String apellido;
    
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    private String sexo;
    private String tipo;

    private String usuario;

    @Column(name = "id_reservas_fk")
    private Integer idReservasFk;
    
    @ManyToOne
    @JoinColumn(name = "id_reservas_fk", insertable = false, updatable = false)
    private Reserva reserva;

}
