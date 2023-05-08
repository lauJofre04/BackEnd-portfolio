package com.portfolio.jofre.Repository;


import com.portfolio.jofre.Entity.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer>{

    public List<Proyecto> findByPersonaId(int personaId);
    
    
}

