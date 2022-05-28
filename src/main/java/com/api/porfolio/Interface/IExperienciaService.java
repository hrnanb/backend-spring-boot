/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.porfolio.Interface;

import com.api.porfolio.models.Experiencia;
import java.util.List;

/**
 *
 * @author herna
 */
public interface IExperienciaService {

    //Traer Lista
    public List<Experiencia> getExperiencia();

    //Guardar
    public void saveExperiencia(Experiencia experiencia);

    //Buscar por Id
    public Experiencia findExperiencia(Long id);

    //Eliminar 
    public void delete(Long id);
}
