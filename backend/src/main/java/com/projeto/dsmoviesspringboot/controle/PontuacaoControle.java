package com.projeto.dsmoviesspringboot.controle;

import com.projeto.dsmoviesspringboot.dto.FilmeDTO;
import com.projeto.dsmoviesspringboot.dto.PontuacaoDTO;
import com.projeto.dsmoviesspringboot.servico.PontuacaoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/scores")
public class PontuacaoControle {

    @Autowired
    private PontuacaoServico service;

    
    //metodo para editar a pontuacao de um filme
    
    @PutMapping
    public FilmeDTO saveScore(@RequestBody PontuacaoDTO dto) {
        FilmeDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }

    
    
}
