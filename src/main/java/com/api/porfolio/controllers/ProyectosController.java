/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.controllers;

import com.api.porfolio.Interface.IProyectosService;
import com.api.porfolio.models.Proyectos;
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
public class ProyectosController {
    
    @Autowired
    IProyectosService proyectosService;

    //Buscar Personas
    @GetMapping("/view/proyectos")
    public List<Proyectos> getProyectos() {
        return proyectosService.getProyectos();
    }

    //Por id
    @GetMapping("/view/proyectos/{id}")
    public Proyectos findProyectos(@PathVariable Long id) {
        return proyectosService.findProyectos(id);
        
    }

    //Actualizar
    @PutMapping("/update/proyectos/")
    public String updateProyectos(@RequestBody Proyectos proyectos) {
        proyectosService.saveProyectos(proyectos);
        return "Se actualizaron los campos";
    }

    //Agregar
    @PostMapping("/new/proyectos")
    public String saveProyectos(@RequestBody Proyectos proyectos) {
        proyectosService.saveProyectos(proyectos);
        return "La persona se agrego correctamente";
    }

    //Eliminar
    @DeleteMapping("/proyectos/delete/{id}")
    public String deleteProyectos(@PathVariable Long id) {
        proyectosService.deleteProyectos(id);
        return "Se pudo eliminar la persona de manera correcta";
    }
}
