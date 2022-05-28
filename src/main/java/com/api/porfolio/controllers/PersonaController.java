/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.controllers;

import com.api.porfolio.Interface.IpersonaService;
import com.api.porfolio.models.Persona;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author herna
 */
@RestController
public class PersonaController {

    @Autowired
    IpersonaService personaService;
    
    
    //Buscar Personas
    @GetMapping("/view/persona")
    public List<Persona> getPersonas() {
        return personaService.getPersonas();
    }

    //Por id
    @GetMapping("/view/persona/{id}")
    public Persona findPersona(@PathVariable Long id) {
        return personaService.findPersona(id);

    }

    //Actualizar
    @PutMapping("/update/persona")
    public String updatePersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
        return "Se actualizo con extio";
    }
    
       
       

// return "Se actualizaron los campos";
    

    //Agregar
    @PostMapping("/new/persona")
    public String savePersona(@RequestBody Persona persona) {
        personaService.savePersona(persona);
        return "La persona se agrego correctamente";
    }

    //Eliminar
    @DeleteMapping("/persona/delete/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
        return "Se pudo eliminar la persona de manera correcta";
    }
}
