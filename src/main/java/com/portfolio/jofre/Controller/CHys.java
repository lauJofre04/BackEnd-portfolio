package com.portfolio.jofre.Controller;

import com.portfolio.jofre.Entity.hys;
import com.portfolio.jofre.Service.Shys;
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

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/skill")
public class CHys {

    @Autowired
    private Shys sHabilidad;
    
    @GetMapping ("/lista")
    public ResponseEntity<List<hys>> lista(){
        List<hys> list = sHabilidad.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     //lista de relojes por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <hys> listaPer(@PathVariable Long id){
        return sHabilidad.findByPersonaId(id);    
        }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<hys> detail(@PathVariable("id") int id){
        hys habilidad = sHabilidad.getOne(id);
        return new ResponseEntity(habilidad, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public void save(@RequestBody hys habi) {
        sHabilidad.save(habi);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        sHabilidad.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody hys habi) {
        sHabilidad.save(habi);
    }

    


    }
