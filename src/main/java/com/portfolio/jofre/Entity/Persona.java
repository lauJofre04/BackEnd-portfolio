
package com.portfolio.jofre.Entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String titulo;
    
    @Lob
    @NotNull
    @Size(min = 20, max = 5000, message = "no cumple con la longitud")
    private String sobreMi;

    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String curriculum;
    //relacion y para que borre si la persona no existe
    @OneToMany(mappedBy="persona", cascade=CascadeType.ALL)
    private List<Proyecto> proyectos; 
    
      //relacion y para que borre si la persona no existe
    @OneToMany(mappedBy="persona", cascade=CascadeType.ALL)
    private List<hys> habilidades; 
    
      //relacion y para que borre si la persona no existe
    @OneToMany(mappedBy="persona", cascade=CascadeType.ALL)
    private List<Educacion> estudios; 
    
      //relacion y para que borre si la persona no existe
    @OneToMany(mappedBy="persona", cascade=CascadeType.ALL)
    private List<Experiencia> experiencias; 

    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String sobreMi, String curriculum) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.curriculum = curriculum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
    
    @JsonManagedReference
    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
     @JsonManagedReference
    public List<hys> getHabilidad() {
        return habilidades;
    }

    public void setHabilidades(List<hys> habilidades) {
        this.habilidades = habilidades;
    }
     @JsonManagedReference
    public List<Educacion> getEstudios() {
        return estudios;
    }

    public void setEstudios(List<Educacion> estudios) {
        this.estudios = estudios;
    }
     @JsonManagedReference
    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }
}
