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

public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eId;
    @NotNull
    private String estudio;
    @Lob
    @NotNull
    private String descripcion;    
    private String imagen;
    private String url;
    private String institucion;
    
     //relacion
    @ManyToOne
    //creacion de columna con llave foranea
    @JoinColumn(name = "id", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
 
    public Educacion() {
    }

    public Educacion(String estudio, String descripcion, String imagen, String url, String institucion, Persona persona) {
        this.estudio = estudio;

        this.descripcion = descripcion;
        this.imagen = imagen;
        this.url = url;
        this.institucion = institucion;
        this.persona = persona;
    }

    public int getEId() {
        return eId;
    }

    public void setId(int id) {
        this.eId = id;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
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

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
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
