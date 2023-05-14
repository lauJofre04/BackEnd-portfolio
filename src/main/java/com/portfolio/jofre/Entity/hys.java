/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.Id;


@Entity

public class hys {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hid;
    @NotNull
    private String habilidad;
    @NotNull
    @Min(0)
    @Max(100)
    private int porcentaje;
    
    //relacion
    @ManyToOne
    //creacion de columna con llave foranea
    @JoinColumn(name = "id", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    


    public hys() {
    }

    public hys(String habilidad, int porcentaje, Persona persona) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.persona = persona;
    }

    public int getHId() {
        return hid;
    }

    public void setHId(int id) {
        this.hid = id;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
     //Opción para que no haga un bug
    @JsonBackReference
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
