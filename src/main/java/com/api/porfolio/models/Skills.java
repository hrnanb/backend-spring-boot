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
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String Tecnologia;
    private String imgSkill;
    private int porcentaje;

    public Skills() {
    }

    public Skills(Long idSkill, String Tecnologia, String imgSkill, int porcentaje) {
        this.idSkill = idSkill;
        this.Tecnologia = Tecnologia;
        this.imgSkill = imgSkill;
        this.porcentaje = porcentaje;
    }
    
    
}
