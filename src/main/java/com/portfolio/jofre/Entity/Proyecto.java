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

public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    @NotNull
    private String proyecto;
    
    @Lob //para indicar que es un texto largo
    @NotNull
    private String descripcion;
    
    
    private String imagen;
    
    private String url;
    
    //relacion
    @ManyToOne
    //creacion de columna con llave foranea
    @JoinColumn(name = "id", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    

    public Proyecto() {
    }

    public Proyecto(String proyecto, String descripcion, String imagen, String url, Persona persona) {
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.url = url;
        this.persona = persona;
    }

    public int getPId() {
        return pid;
    }

    public void setPId(int id) {
        this.pid = id;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
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
    //Opción para que no haga un bug
    @JsonBackReference
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
