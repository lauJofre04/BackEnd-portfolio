/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Service;
import com.portfolio.jofre.Repository.RProyecto;
import com.portfolio.jofre.Entity.Proyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
@Transactional//persistencia en base de datos
public class ProyectoService {

    @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Proyecto getOne(int id){
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }      
    
    public void save(Proyecto proye){
        rProyecto.save(proye);
    }
    
     public void delete(int id){
        rProyecto.deleteById(id);
    }
     
     public void edit(Proyecto proye){
        rProyecto.save(proye);
    }
           
     
     
    
    
}