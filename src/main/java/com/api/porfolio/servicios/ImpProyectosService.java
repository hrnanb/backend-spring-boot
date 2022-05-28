/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.servicios;

import com.api.porfolio.Interface.IProyectosService;
import com.api.porfolio.models.Proyectos;
import com.api.porfolio.repositorios.IproyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author herna
 */
@Service
public class ImpProyectosService implements IProyectosService {

    @Autowired
    IproyectosRepository proyectosRepo;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = proyectosRepo.findAll();
        return proyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
        proyectosRepo.save(proyectos);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = proyectosRepo.findById(id).orElse(null);
        return proyectos;
    }

    @Override
    public void deleteProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }
}
