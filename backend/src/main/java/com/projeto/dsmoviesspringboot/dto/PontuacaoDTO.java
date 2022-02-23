package com.projeto.dsmoviesspringboot.dto;

public class PontuacaoDTO {

    private Long movieId;
    private String email;
    private Double pontuacao;

    public PontuacaoDTO() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
    

}
