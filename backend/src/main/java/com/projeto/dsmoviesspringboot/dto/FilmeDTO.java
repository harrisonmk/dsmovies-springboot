package com.projeto.dsmoviesspringboot.dto;

import com.projeto.dsmoviesspringboot.modelo.Filme;

public class FilmeDTO {

    private Long id;

    private String titulo;

    private Double pontuacao;

    private Integer contador;

    private String imagem;

    
    
    public FilmeDTO() {
    }

    public FilmeDTO(Long id, String titulo, Double pontuacao, Integer contador, String imagem) {
        this.id = id;
        this.titulo = titulo;
        this.pontuacao = pontuacao;
        this.contador = contador;
        this.imagem = imagem;
    }

    //	mandar uma copia para a entidade
    public FilmeDTO(Filme filme) {
        id = filme.getId();
        titulo = filme.getTitulo();
        pontuacao = filme.getPontuacao();
        contador = filme.getContador();
        imagem = filme.getImagem();
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

    
    
    
}
