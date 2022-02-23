package com.projeto.dsmoviesspringboot.servico;

import com.projeto.dsmoviesspringboot.dto.FilmeDTO;
import com.projeto.dsmoviesspringboot.modelo.Filme;
import com.projeto.dsmoviesspringboot.repositorio.FilmeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmeServico {

    @Autowired
    private FilmeRepositorio repositorio;

    //busca todos os filmes
    @Transactional(readOnly = true) //true significa que o metodo eh apenas de leitura no banco de dados
    public Page<FilmeDTO> findAll(Pageable pageable) {
        Page<Filme> result = repositorio.findAll(pageable);
        // converter para dto
        Page<FilmeDTO> page = result.map(x -> new FilmeDTO(x));
        return page;
    }

    
    //busca apenas um filme por id
    @Transactional(readOnly = true) //true significa que o metodo eh apenas de leitura no banco de dados
    public FilmeDTO findById(Long id) {
        Filme result = repositorio.findById(id).get();
        // converter para dto
        FilmeDTO dto = new FilmeDTO(result);
        return dto;
    }
    
    

}
