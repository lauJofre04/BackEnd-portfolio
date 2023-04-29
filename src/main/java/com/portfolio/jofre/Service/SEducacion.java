/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Service;

import com.portfolio.jofre.Entity.Educacion;
import com.portfolio.jofre.Repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    public Educacion getOne(int id){
        Educacion edu= rEducacion.findById(id).orElse(null);
        return edu;
    }
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    public void edit(Educacion edu){
        rEducacion.save(edu);
    }
    public List<Educacion> findByPersonaId(Long personaId){
        return rEducacion.findByPersonaId(personaId);
    }
}
