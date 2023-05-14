/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jofre.Repository;

import com.portfolio.jofre.Entity.Educacion;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface REducacion extends JpaRepository<Educacion,Integer> {
    List<Educacion> findByPersonaId(int personaId);

    public Object findById(int eid);
    public void deleteById(int eid);
}
