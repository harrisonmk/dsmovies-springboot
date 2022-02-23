
package com.projeto.dsmoviesspringboot.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Pontuacao implements Serializable {
    
    
    // quando a pk é composta instanciar para garantir que será iniciada
    @EmbeddedId //indica que é uma chave composta
    private PontuacaoPK id = new PontuacaoPK(); // é como se fosse duas referencias em uma
    
    @Column(name = "value")
    private Double valor;

    public Pontuacao() {
    }

    public void setMovie(Filme filme) {
        id.setFilme(filme);
    }

    public void setUser(Usuario usuario) {
        id.setUsuario(usuario);
    }

    public PontuacaoPK getId() {
        return id;
    }

    public void setId(PontuacaoPK id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
