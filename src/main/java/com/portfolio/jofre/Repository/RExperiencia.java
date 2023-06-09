/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jofre.Repository;

import com.portfolio.jofre.Entity.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface RExperiencia extends JpaRepository<Experiencia,Integer>{
    
    List<Experiencia> findByPersonaId(int personaId);

    public Object findById(int id);

    public void deleteById(int id);


}
