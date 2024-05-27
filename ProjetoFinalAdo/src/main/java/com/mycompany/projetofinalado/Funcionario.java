package com.mycompany.projetofinalado;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, int idade, String cpf, String cargo, double salario, String dataAdmissao) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    // Getters e setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
