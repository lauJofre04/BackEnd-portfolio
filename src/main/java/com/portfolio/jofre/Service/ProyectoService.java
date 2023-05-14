/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Service;
import com.portfolio.jofre.Repository.RProyecto;
import com.portfolio.jofre.Entity.Proyecto;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Service
@Transactional//persistencia en base de datos
public class ProyectoService {

 
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Proyecto getOne(int pid){
        Proyecto proye = (Proyecto) rProyecto.findById(pid);
        return proye;
    }      
    
    public void save(Proyecto proye){
        rProyecto.save(proye);
    }
    
     public void delete(int pid){
        rProyecto.deleteById(pid);
    }
     
     public void edit(Proyecto proye){
        rProyecto.save(proye);
    }
     public List<Proyecto> findByPersonaId(int personaId) {
        return rProyecto.findByPersonaId(personaId);
    }      
     
     
    
    
}
