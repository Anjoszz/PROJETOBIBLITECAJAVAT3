package com.mycompany.projetofinalado;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private String numeroMatricula;
    private List<Emprestimo> historicoEmprestimos;

    public Usuario(String nome, int idade, String cpf, String numeroMatricula) {
        super(nome, idade, cpf);
        this.numeroMatricula = numeroMatricula;
        this.historicoEmprestimos = new ArrayList<>();
    }

    // Getters e setters
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void addEmprestimo(Emprestimo emprestimo) {
        this.historicoEmprestimos.add(emprestimo);
    }
}
