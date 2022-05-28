/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.controllers;

import com.api.porfolio.Interface.IExperienciaService;
import com.api.porfolio.models.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author herna
 */
@RestController
public class ExperienciaController {
    
        @Autowired
        IExperienciaService experienciaService;
    
    
    //Buscar Personas
    @GetMapping("/view/experiencia")
    public List<Experiencia> getExperiencia() {
        return experienciaService.getExperiencia();
    }

    //Por id
    @GetMapping("/view/experiencia/{id}")
    public Experiencia findExperiencia(@PathVariable Long id) {
        return experienciaService.findExperiencia(id);

    }

    //Actualizar
    @PutMapping("/update/experiencia/")
    public String updateExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.saveExperiencia(experiencia);
        return "Se actualizaron los campos";
    }

    //Agregar
    @PostMapping("/new/experiencia")
    public String saveExperiencia(@RequestBody Experiencia experiencia) {
       experienciaService.saveExperiencia(experiencia);
        return "La persona se agrego correctamente";
    }

    //Eliminar
    @DeleteMapping("/experiencia/delete/{id}")
    public String deleteExperiencia(@PathVariable Long id) {
        experienciaService.delete(id);
        return "Se pudo eliminar la persona de manera correcta";
    }
}
