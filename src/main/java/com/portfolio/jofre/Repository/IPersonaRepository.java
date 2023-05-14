
package com.portfolio.jofre.Repository;

import com.portfolio.jofre.Entity.Persona;
import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    @Bean
    public Optional<Persona> findByNombre(String nombre);
    @Bean
    public boolean existsByNombre(String nombre);
    
    @Bean
    public boolean existsById(int id);
    
    @Bean
    public void deleteById(int id);
    
    @Bean
    public Optional<Persona> findById(int id);

  

}
