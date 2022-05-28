/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.porfolio.Interface;

import com.api.porfolio.models.Skills;
import java.util.List;

/**
 *
 * @author herna
 */
public interface ISkillsService {
    //Traer Lista

    public List<Skills> getSkills();

    //Guardar
    public void saveSkills(Skills skills);

    //Buscar por Id
    public Skills findSkills(Long id);

    //Eliminar 
    public void deleteSkills(Long id);
}
