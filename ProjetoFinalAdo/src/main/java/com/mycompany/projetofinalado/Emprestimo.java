package com.mycompany.projetofinalado;

public class Emprestimo {
    private Usuario usuario;
    private Exemplar exemplar;
    private String dataInicio;
    private String dataDevolucaoPrevista;
    private String status;

    public Emprestimo(Usuario usuario, Exemplar exemplar, String dataInicio, String dataDevolucaoPrevista) {
        this.usuario = usuario;
        this.exemplar = exemplar;
        this.dataInicio = dataInicio;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.status = "ativo";
    }

    // Getters e setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
    