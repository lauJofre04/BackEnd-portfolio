/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Service;

import com.portfolio.jofre.Entity.Experiencia;
import com.portfolio.jofre.Repository.RExperiencia;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Service
@Transactional
public class SExperiencia {
   
     RExperiencia rExperiencia;
     
     public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    public Experiencia getOne(int id){
        Experiencia expe =(Experiencia) rExperiencia.findById(id);
        return expe;
    }
       
    
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    
     public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public void edit(Experiencia expe){
        rExperiencia.save(expe);
    }
    
    //busca lista de relojes por la id de la persona
    public List<Experiencia> findByPersonaId(int personaId) {
        return rExperiencia.findByPersonaId(personaId);
    }
}
