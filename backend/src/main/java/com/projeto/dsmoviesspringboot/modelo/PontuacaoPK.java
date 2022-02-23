package com.projeto.dsmoviesspringboot.modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//classe criada pq a pontuacao possui uma chave composta entao 
//essa classe é especifica para gerar a chave composta de filme e usuario
//dentro do score
@Embeddable
public class PontuacaoPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne //muitos para um | uma pontuacao vai ter um filme
    @JoinColumn(name = "movie_id")
    private Filme filme;

    @ManyToOne //muitos para um | uma pontuacao vai ter um usuario
    @JoinColumn(name = "user_id")
    private Usuario usuario;

    public PontuacaoPK() {
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
}
