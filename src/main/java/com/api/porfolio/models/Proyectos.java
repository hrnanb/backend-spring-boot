/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author herna
 */
@Entity
@Getter
@Setter
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String nombreProyecto;
    private String tecnologiaProyecto;
    private String descripcion;
    private String imgProyecto;
    private String urlProyecto;

    public Proyectos() {
    }

    public Proyectos(Long idProyecto, String nombreProyecto, String tecnologiaProyecto, String descripcion, String imgProyecto, String urlProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.tecnologiaProyecto = tecnologiaProyecto;
        this.descripcion = descripcion;
        this.imgProyecto = imgProyecto;
        this.urlProyecto = urlProyecto;
    }
    
    
}
