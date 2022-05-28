/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.controllers;

import com.api.porfolio.Interface.ISkillsService;
import com.api.porfolio.models.Skills;
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
public class SkillsController {
    
    @Autowired
    ISkillsService skillsService;

    //Buscar Personas
    @GetMapping("/view/skills")
    public List<Skills> getSkills() {
        return skillsService.getSkills();
    }

    //Por id
    @GetMapping("/view/skills/{id}")
    public Skills findSkills(@PathVariable Long id) {
        return skillsService.findSkills(id);
        
    }

    //Actualizar
    @PutMapping("/update/skills/")
    public String updateSkills(@RequestBody Skills skills) {
        skillsService.saveSkills(skills);
        return "Se actualizaron los campos";
    }

    //Agregar
    @PostMapping("/new/skills")
    public String saveSkills(@RequestBody Skills skills) {
        skillsService.saveSkills(skills);
        return "Se actualizaron los campos";
    }

    //Eliminar
    @DeleteMapping("/skills/delete/{id}")
    public String deleteSkills(@PathVariable Long id) {
        skillsService.deleteSkills(id);
        return "Se pudo eliminar la persona de manera correcta";
    }
}
