package com.projeto.dsmoviesspringboot.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Filme implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String titulo;

    @Column(name = "score")
    private Double pontuacao;

    @Column(name = "count")
    private Integer contador;

    @Column(name = "image")
    private String imagem;

    @OneToMany(mappedBy = "id.filme") //um filme possui varias pontuacoes
    private Set<Pontuacao> pontuacoes = new HashSet<>();

    public Filme() {
    }

    public Filme(Long id, String titulo, Double pontuacao, Integer contador, String imagem) {
        this.id = id;
        this.titulo = titulo;
        this.pontuacao = pontuacao;
        this.contador = contador;
        this.imagem = imagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Set<Pontuacao> getScores() {
        return pontuacoes;
    }
    
    
    

}
