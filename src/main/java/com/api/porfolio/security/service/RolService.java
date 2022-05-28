/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.security.service;

import com.api.porfolio.security.entity.Rol;
import com.api.porfolio.security.enums.RolNombre;
import com.api.porfolio.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author herna
 */
@Service
@Transactional
public class RolService {
        @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolnombre){
        return rolRepository.findByRolNombre(rolnombre);
    }
     public void save(Rol rol){
        rolRepository.save(rol);
    }
}
