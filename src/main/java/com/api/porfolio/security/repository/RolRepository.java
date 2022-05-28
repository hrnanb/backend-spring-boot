/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.porfolio.security.repository;


import com.api.porfolio.security.entity.Rol;
import com.api.porfolio.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author herna
 */
@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
     Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
