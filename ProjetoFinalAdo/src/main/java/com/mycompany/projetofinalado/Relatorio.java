package com.mycompany.projetofinalado;

import java.util.List;

public class Relatorio {
    public void gerarRelatorioEmprestimos(List<Emprestimo> emprestimos) {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Usuário: " + emprestimo.getUsuario().getNome() + 
                               ", Livro: " + emprestimo.getExemplar().getLivro().getTitulo() + 
                               ", Data de Início: " + emprestimo.getDataInicio() +
                               ", Data de Devolução Prevista: " + emprestimo.getDataDevolucaoPrevista() +
                               ", Status: " + emprestimo.getStatus());
        }
    }
}