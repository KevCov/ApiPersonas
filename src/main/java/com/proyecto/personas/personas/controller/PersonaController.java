package com.proyecto.personas.personas.controller;

import com.proyecto.personas.personas.model.Persona;
import com.proyecto.personas.personas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@CrossOrigin("*")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping(value = "/personas")
    public List<Persona> getPersonas(){
        return personaRepository.findAll();
    }

    @PostMapping(value = "personas/savePersona")
    public void savePersona(@RequestBody Persona per) {
        personaRepository.save(per);
    }

    @DeleteMapping(value = "/personas/delete/{name}")
    public void deletePersona(@PathVariable String name){
        Optional<Persona> per = personaRepository.findAll().stream().filter( p -> p.getNombre().equalsIgnoreCase(name)).findFirst();
        per.ifPresent(persona -> personaRepository.delete(persona));
    }
}
