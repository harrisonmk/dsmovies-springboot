
package com.projeto.dsmoviesspringboot.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Pontuacao {
    
    // quando a pk é composta instanciar para garantir que será iniciada
    @EmbeddedId
    private PontuacaoPK id = new PontuacaoPK();
    private Double value;

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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
}
