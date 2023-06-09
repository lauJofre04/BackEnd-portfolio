package com.portfolio.jofre.Interface;

import com.portfolio.jofre.Entity.Persona;

import java.util.List;





public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    //Guarda un objeto de Persona
    public void savePersona(Persona persona);
    //Eliminar un objeto persona
    public void deletePersona(int id);
    //Buscar una persona por id
    public Persona findPersona(int id);
}
