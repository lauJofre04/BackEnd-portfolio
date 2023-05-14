
package com.portfolio.jofre.Security.Service;

import com.portfolio.jofre.Security.Enuns.Entity.Usuario;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.portfolio.jofre.Security.Repository.IUsuarioRepository;
import org.springframework.context.annotation.Configuration;

@Service
@Configuration
public class UsuarioService {
    
    IUsuarioRepository iusuarioRepository;
    

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
  
    public void save(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }
    
}
