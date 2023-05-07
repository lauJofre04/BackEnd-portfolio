/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jofre.Controller;

import com.portfolio.jofre.Entity.Proyecto;
import com.portfolio.jofre.Service.ProyectoService;
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
@RequestMapping("/proyecto")
@RestController
@CrossOrigin(origins="https://frontend-jofrelautaro.web.app",exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
public class CProyecto {
    @Autowired
    ProyectoService sProyecto;
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Proyecto>> lista(){
        List<Proyecto> list = sProyecto.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> detail(@PathVariable("id") int id){
        Proyecto proye = sProyecto.getOne(id);
        return new ResponseEntity(proye, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public void create(@RequestBody Proyecto proye) {
        sProyecto.save(proye);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        sProyecto.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Proyecto proye) {
        sProyecto.edit(proye);
    }
}
