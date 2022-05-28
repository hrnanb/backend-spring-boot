/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.porfolio.Interface;

import com.api.porfolio.models.Educacion;
import java.util.List;

/**
 *
 * @author herna
 */
public interface IEducacionService {

    //Traer Lista
    public List<Educacion> getEducacion();

    //Guardar
    public void saveEducacion(Educacion educacion);

    //Buscar por Id
    public Educacion findEducacion(Long id);

    //Eliminar 
    public void deleteEducacion(Long id);
    
   //Editar
    public void editEducacion(Educacion educacion);
}
