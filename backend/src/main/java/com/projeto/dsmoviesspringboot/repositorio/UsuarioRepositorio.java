
package com.projeto.dsmoviesspringboot.repositorio;

import com.projeto.dsmoviesspringboot.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    
    
    Usuario findByEmail(String email);
    
}
