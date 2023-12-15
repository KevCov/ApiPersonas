package com.proyecto.personas.personas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (schema = "tablePersona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String dni;
    @Column
    private int edad;
}
