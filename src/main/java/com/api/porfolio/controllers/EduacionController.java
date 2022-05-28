/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.controllers;

import com.api.porfolio.Interface.IEducacionService;
import com.api.porfolio.models.Educacion;
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
public class EduacionController {

    @Autowired
    IEducacionService eduService;

    //Buscar Personas
    @GetMapping("/view/educacion")
    public List<Educacion> getEducacion() {
        return eduService.getEducacion();
    }

    //Por id
    @GetMapping("/view/educacion/{id}")
    public Educacion findEducacion(@PathVariable Long id) {
        return eduService.findEducacion(id);

    }

    //Actualizar
    @PutMapping("/update/educacion")
    public String updateEducacion(@RequestBody Educacion educacion) {
         eduService.editEducacion(educacion);
        return "Se actualizaron los campos";
    }

    //Agregar
    @PostMapping("/new/educacion")
    public String saveEducacion(@RequestBody Educacion educacion) {
        eduService.saveEducacion(educacion);
        return "La persona se agrego correctamente";
    }

    //Eliminar
    @DeleteMapping("/educacion/delete/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        eduService.deleteEducacion(id);
        return "Se pudo eliminar la persona de manera correcta";
    }

}
