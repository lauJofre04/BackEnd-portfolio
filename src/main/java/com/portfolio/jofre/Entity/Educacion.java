/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date inicio;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fin; 
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

    public Educacion(String estudio, Date inicio, Date fin, String descripcion, String imagen, String url, String institucion, Persona persona) {
        this.estudio = estudio;
        this.inicio = inicio;
        this.fin = fin;
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
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
