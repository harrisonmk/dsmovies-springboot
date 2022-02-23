
package com.projeto.dsmoviesspringboot.repositorio;

import com.projeto.dsmoviesspringboot.modelo.Pontuacao;
import com.projeto.dsmoviesspringboot.modelo.PontuacaoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontuacaoRepositorio extends JpaRepository<Pontuacao, PontuacaoPK> {
    
}
