/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.models;

import java.util.Date;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author herna
 */
@Entity
@Getter
@Setter
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idPersona;
    private String nombre;
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNac;
    private String sobre_mi;
    private String imgPersona;
    private String titulo;
    private String subtitulo;
    private String direccion;

    public Persona() {
    }

    public Persona(Long idPersona, String nombre, String apellido, Date fechaNac, String sobre_mi, String imgPersona, String titulo, String subtitulo, String direccion) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.sobre_mi = sobre_mi;
        this.imgPersona = imgPersona;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.direccion = direccion;
    }

    
}
