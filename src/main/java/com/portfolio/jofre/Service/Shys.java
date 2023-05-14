package com.portfolio.jofre.Service;

import com.portfolio.jofre.Entity.hys;
import com.portfolio.jofre.Repository.Rhys;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Shys {
    
    Rhys rhys;
    
    public List<hys> list(){
        return rhys.findAll();
    }
    
    public hys getOne(int id){
        return (hys) rhys.findById(id);
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
