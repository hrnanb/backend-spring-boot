/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.security.service;


import com.api.porfolio.security.entity.Usuario;
import com.api.porfolio.security.repository.UsuarioRepository;
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
public class UsuarioService {
     @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
        
    }
    
    public boolean existsByNombreUsuario(String NombreUsuario){
        return usuarioRepository.existsByNombreUsuario(NombreUsuario);
    }
      public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
      
      public void save(Usuario usuario){
          usuarioRepository.save(usuario);
      }
}
