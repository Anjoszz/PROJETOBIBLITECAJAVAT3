
package com.mycompany.projetofinalado;

 abstract public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String cargo = null;
    
    public Pessoa(String nome, String cpf, int idade, String cargo){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cargo = cargo;
    }
    
    public String InfoPessoa(){
        return "Nome: " + nome + " cpf: " + cpf + " Idade: " + idade + "Cargo: " + cargo; 
  }
 
 }

