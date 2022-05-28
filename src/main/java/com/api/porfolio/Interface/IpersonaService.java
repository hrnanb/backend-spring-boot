/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.porfolio.Interface;

import com.api.porfolio.models.Persona;
import java.util.List;

/**
 *
 * @author herna
 */
public interface IpersonaService {

    //Traer Lista
    public List<Persona> getPersonas();

    //Guardar
    public void savePersona(Persona persona);

    //Buscar por Id
    public Persona findPersona(Long id);

    //Eliminar 
    public void deletePersona(Long id);

}
