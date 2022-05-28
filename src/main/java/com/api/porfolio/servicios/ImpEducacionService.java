/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.servicios;

import com.api.porfolio.Interface.IEducacionService;
import com.api.porfolio.models.Educacion;
import com.api.porfolio.repositorios.IeducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author herna
 */
@Service
public class ImpEducacionService implements IEducacionService {
    
    @Autowired
    IeducacionRepository educacionRepo;
    
    @Override
    public List<Educacion> getEducacion() {
        
        List<Educacion> educacion = educacionRepo.findAll();
        return educacion;
        
    }
    
    @Override
    public void saveEducacion(Educacion educacion) {
        
        educacionRepo.save(educacion);
    }
    
    @Override
    public Educacion findEducacion(Long id) {
        
        Educacion educacion = educacionRepo.findById(id).orElse(null);
        return educacion;
    }
    
    @Override
    public void deleteEducacion(Long id) {
        educacionRepo.deleteById(id);
        
    }
    
    @Override
    public void editEducacion(Educacion educacion){
        educacionRepo.save(educacion);
    }
    
}
