/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.servicios;

import com.api.porfolio.Interface.IpersonaService;
import com.api.porfolio.models.Persona;
import com.api.porfolio.repositorios.IpersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author herna
 */
@Service
public class ImpPersonaSerivce implements IpersonaService {
    
    @Autowired
    IpersonaRepository personaRepository;
    
    @Override
    public List<Persona> getPersonas() {
        List<Persona> persona = personaRepository.findAll();
        return persona;
        
    }
    
    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }
    
    @Override
    public Persona findPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
        
    }
    
    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
    
}
