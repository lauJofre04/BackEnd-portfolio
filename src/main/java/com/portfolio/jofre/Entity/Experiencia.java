/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.Temporal;

/**
 *
 * @author User
 */
@Entity

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exId;
    @NotNull
    private String puesto;
    
    @NotNull
    @Lob   
    private String descripcion;
    
    private String imagen;
    
    private String url;
    
    private String empresa;
    
    private boolean esTrabajoActual;
    
     //relacion
    @ManyToOne
    //creacion de columna con llave foranea
    @JoinColumn(name = "id", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    public Experiencia() {
    }

    public Experiencia(String puesto, String descripcion, String imagen, String url, String empresa, boolean esTrabajoActual, Persona persona) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.url = url;
        this.empresa = empresa;
        this.esTrabajoActual = esTrabajoActual;
        this.persona = persona;
    }

    public int getexId() {
        return exId;
    }

    public void setexId(int id) {
        this.exId = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
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