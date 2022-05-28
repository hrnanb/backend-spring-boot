/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author herna
 */
@Entity
@Getter
@Setter
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id__Edu;
    private String nombreInstitucion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    private String descripcionEdu;
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long id__Edu, String nombreInstitucion, Date fechaInicio, Date fechaFin, String descripcionEdu, String imgEdu) {
        this.id__Edu = id__Edu;
        this.nombreInstitucion = nombreInstitucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionEdu = descripcionEdu;
        this.imgEdu = imgEdu;
    }
    
    
}
