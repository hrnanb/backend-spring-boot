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
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String nombreEmpresa;
    private String tipoTrabajo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    private String descripcionTrabajo;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String nombreEmpresa, String tipoTrabajo, Date fechaInicio, Date fechaFin, String descripcionTrabajo, String imgExp) {
        this.idExp = idExp;
        this.nombreEmpresa = nombreEmpresa;
        this.tipoTrabajo = tipoTrabajo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionTrabajo = descripcionTrabajo;
        this.imgExp = imgExp;
    }
    
    
}
