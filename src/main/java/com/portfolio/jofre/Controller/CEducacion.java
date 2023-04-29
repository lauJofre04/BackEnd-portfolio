/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Controller;

import com.portfolio.jofre.Entity.Educacion;
import com.portfolio.jofre.Service.SEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins="http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
        @GetMapping ("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      //lista de relojes por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Educacion> listaPer(@PathVariable Long id){
        return sEducacion.findByPersonaId(id);    
        }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> detail(@PathVariable("id") int id){
        Educacion edu = sEducacion.getOne(id);
        return new ResponseEntity(edu, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public void save(@RequestBody Educacion edu) {      
        sEducacion.save(edu);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        sEducacion.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Educacion edu) {      
        sEducacion.save(edu);
    }
}
