package com.mycompany.projetofinalado;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma biblioteca
public class Biblioteca {
    // Lista de exemplares na biblioteca
    private List<Exemplar> exemplares;
    // Lista de usuários cadastrados na biblioteca
    private List<Usuario> usuarios;
    // Lista de empréstimos realizados na biblioteca
    private List<Emprestimo> emprestimos;

    // Construtor da classe Biblioteca
    public Biblioteca() {
        // Inicializa as listas vazias quando uma nova biblioteca é criada
        this.exemplares = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    // Método para adicionar um exemplar à lista de exemplares
    public void adicionarExemplar(Exemplar exemplar) {
        exemplares.add(exemplar);
    }

    // Método para cadastrar um usuário na lista de usuários
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para realizar um empréstimo e adicionar à lista de empréstimos
    public void realizarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        // Adiciona o empréstimo ao histórico de empréstimos do usuário
        emprestimo.getUsuario().addEmprestimo(emprestimo);
    }

    // Método para devolver um empréstimo
    public void devolverEmprestimo(Emprestimo emprestimo) {
        // Define o status do empréstimo como "devolvido"
        emprestimo.setStatus("devolvido");
    }

    // Método para obter a lista de empréstimos
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    
    // Método para obter a lista de exemplares
    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    // Método para obter a lista de usuários
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
