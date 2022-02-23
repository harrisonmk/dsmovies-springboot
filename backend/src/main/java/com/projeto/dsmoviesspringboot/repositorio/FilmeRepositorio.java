
package com.projeto.dsmoviesspringboot.repositorio;

import com.projeto.dsmoviesspringboot.modelo.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepositorio extends JpaRepository<Filme, Long> {
    
}
