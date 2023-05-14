package com.portfolio.jofre.Service;

import com.portfolio.jofre.Entity.Persona;
import com.portfolio.jofre.Repository.IPersonaRepository;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class ImpPersonaService{
    
    
    IPersonaRepository rPersona ;
    
     public List<Persona> list(){
        return rPersona.findAll();
    }
    
    public Persona getOne(int id){
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }    
   
    
    public void save(Persona pers){
        rPersona.save(pers);
    }      
    
   
     public void delete(int id){
        rPersona.deleteById(id);
    }    
     
     public void edit(Persona pers){
        rPersona.save(pers);
    }  

}