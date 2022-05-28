/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.porfolio.Interface;

import com.api.porfolio.models.Proyectos;
import java.util.List;

/**
 *
 * @author herna
 */
public interface IProyectosService {

    //Traer Lista
    public List<Proyectos> getProyectos();

    //Guardar
    public void saveProyectos(Proyectos proyectos);

    //Buscar por Id
    public Proyectos findProyectos(Long id);

    //Eliminar 
    public void deleteProyectos(Long id);
}
