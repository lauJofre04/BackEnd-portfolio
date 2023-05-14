/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Service;

import com.portfolio.jofre.Entity.Educacion;
import com.portfolio.jofre.Repository.REducacion;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Service
@Transactional
public class SEducacion {
    
    REducacion rEducacion;
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    public Educacion getOne(int eid){
        Educacion edu= (Educacion) rEducacion.findById(eid);
        return edu;
    }
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    public void delete(int eid){
        rEducacion.deleteById(eid);
    }
    public void edit(Educacion edu){
        rEducacion.save(edu);
    }
    public List<Educacion> findByPersonaId(int id){
        return rEducacion.findByPersonaId(id);
    }
}
