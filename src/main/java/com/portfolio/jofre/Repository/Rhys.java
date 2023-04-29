package com.portfolio.jofre.Repository;

import com.portfolio.jofre.Entity.hys;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rhys extends JpaRepository<hys, Integer>{
    List<hys> findByPersonaId(Long personaId);
}
