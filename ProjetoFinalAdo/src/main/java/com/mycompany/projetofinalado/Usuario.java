package com.mycompany.projetofinalado;


public class Usuario extends Pessoa {
    protected String numeroMatricula;
    protected String Email;
    private String senha;
    protected String[] HistoricoEmprestimo; 
    
    
    
    public Usuario(String nome, String cpf, int idade, String cargo, String HistoticoEmprestimo){
        super(nome,cpf,idade, cargo);
        HistoricoEmprestimo = new String[100];
    }
    
    
    @Override
    public String InfoPessoa(){
        cargo = "usuario";
        return "Nome: " + nome + " cpf: " + cpf + " Idade: " + idade + "Cargo: " + cargo + " Historico de emprestimo " + HistoricoEmprestimo; 
  }
}
