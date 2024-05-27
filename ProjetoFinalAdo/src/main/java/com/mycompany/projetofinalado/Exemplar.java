package com.mycompany.projetofinalado;

public class Exemplar {
    private Livro livro;
    private String numeroIdentificacao;

    public Exemplar(Livro livro, String numeroIdentificacao) {
        this.livro = livro;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    // Getters e setters
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }
}
