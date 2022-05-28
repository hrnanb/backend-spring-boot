/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.servicios;

import com.api.porfolio.Interface.IExperienciaService;
import com.api.porfolio.models.Experiencia;
import com.api.porfolio.repositorios.IexperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author herna
 */
@Service
public class ImpExperienciaService implements IExperienciaService {
    
    @Autowired
    IexperienciaRepository experienciaRepo;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = experienciaRepo.findAll();
        return experiencia;
    }
    
    @Override
    public void saveExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }
    
    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = experienciaRepo.findById(id).orElse(null);
        return experiencia;
    }
    
    @Override
    public void delete(Long id) {
        
        experienciaRepo.deleteById(id);
    }
    
}
