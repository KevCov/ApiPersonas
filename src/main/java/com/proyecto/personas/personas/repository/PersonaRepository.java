package com.proyecto.personas.personas.repository;

import com.proyecto.personas.personas.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
