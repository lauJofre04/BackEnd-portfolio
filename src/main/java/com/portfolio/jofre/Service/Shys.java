package com.portfolio.jofre.Service;

import com.portfolio.jofre.Entity.hys;
import com.portfolio.jofre.Repository.Rhys;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class Shys {
    @Autowired
    Rhys rhys;
    
    public List<hys> list(){
        return rhys.findAll();
    }
    
    public hys getOne(int id){
        return rhys.findById(id).orElse(null);
    }
        
    
    public void save(hys habi){
        rhys.save(habi);
    }
    
     public void delete(int id){
        rhys.deleteById(id);
    }
    
     public void edit(hys habi){
        rhys.save(habi);
    }
    
     //busca lista de relojes por la id de la persona
    public List<hys> findByPersonaId(int personaId) {
        return rhys.findByPersonaId(personaId);
    }
}
