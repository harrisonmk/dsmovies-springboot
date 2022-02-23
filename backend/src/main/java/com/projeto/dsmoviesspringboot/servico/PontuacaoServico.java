package com.projeto.dsmoviesspringboot.servico;

import com.projeto.dsmoviesspringboot.dto.FilmeDTO;
import com.projeto.dsmoviesspringboot.dto.PontuacaoDTO;
import com.projeto.dsmoviesspringboot.modelo.Filme;
import com.projeto.dsmoviesspringboot.modelo.Pontuacao;
import com.projeto.dsmoviesspringboot.modelo.Usuario;
import com.projeto.dsmoviesspringboot.repositorio.FilmeRepositorio;
import com.projeto.dsmoviesspringboot.repositorio.PontuacaoRepositorio;
import com.projeto.dsmoviesspringboot.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PontuacaoServico {

    @Autowired
    private FilmeRepositorio filmeRepositorio;

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PontuacaoRepositorio PontuacaoRepositorio;

    
    @Transactional
    public FilmeDTO saveScore(PontuacaoDTO dto) {
        Usuario usuario = usuarioRepositorio.findByEmail(dto.getEmail());
        if (usuario == null) {
            usuario = new Usuario();
            usuario.setEmail(dto.getEmail());
            usuario = usuarioRepositorio.saveAndFlush(usuario);
        }

        Filme filme = filmeRepositorio.findById(dto.getMovieId()).get();

        Pontuacao score = new Pontuacao();
        score.setMovie(filme);
        score.setUser(usuario);
        score.setValor(dto.getPontuacao());

        score = PontuacaoRepositorio.saveAndFlush(score);

        double sum = 0.0;
        for (Pontuacao s : filme.getScores()) {
            sum += s.getValor();
        }

        double avg = sum / filme.getScores().size();

        filme.setPontuacao(avg);
        filme.setContador(filme.getScores().size());

        filme = filmeRepositorio.save(filme);

        return new FilmeDTO(filme);
    }
    
    

}
