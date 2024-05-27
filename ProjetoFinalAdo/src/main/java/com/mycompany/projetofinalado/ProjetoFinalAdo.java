
package com.mycompany.projetofinalado;

public class ProjetoFinalAdo {
    public static void main(String[] args) {
        // Inicialização do sistema e interação com o usuário via console
        Biblioteca biblioteca = new Biblioteca();

        // Exemplo de criação e cadastro de usuários, exemplares e empréstimos
        Usuario usuario1 = new Usuario("Kauã", 19, "54778983807", "001");
        Usuario usuario2 = new Usuario("Matheus", 19, "46103491835", "001");
        
        Livro livro1 = new Livro("Bahia", "Bahiano", "Bahianinho", 2013);
        Exemplar exemplar1 = new Exemplar(livro1, "EX1");
        
        Livro livro2 = new Livro("Nordeste", "Bahiano", "Bahianinho", 2013);
        Exemplar exemplar2 = new Exemplar(livro2, "EX2");
        
        //Métodos para cadastrar úsuario nas arrays list 
        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.adicionarExemplar(exemplar1);
        
        biblioteca.cadastrarUsuario(usuario2);
        biblioteca.adicionarExemplar(exemplar2);
        
        // Criando um novo emprestimo, atribuindo usuario e exemplar
        Emprestimo emprestimo = new Emprestimo(usuario1, exemplar1, "23/05/2024", "30/05/2024");
        biblioteca.realizarEmprestimo(emprestimo);

        // Exibir todos os livros cadastrados
        System.out.println("Livros cadastrados:");
        for (Exemplar exemplar : biblioteca.getExemplares()) {
            System.out.println(exemplar.getLivro().getTitulo());
        }

        // Exibir todos os usuários cadastrados
        System.out.println("\nUsuários cadastrados:");
        for (Usuario usuario : biblioteca.getUsuarios()) {
            System.out.println(usuario.getNome());
        }

        // Exibir todos os empréstimos realizados
        System.out.println("\nEmpréstimos realizados:");
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorioEmprestimos(biblioteca.getEmprestimos());
    
        //teste de cpf
        String cpfValido1 = "12345678909";
        System.out.println("cpf está válido? " +  Utilitarios.validarCPF(cpfValido1));
        String cpfInvalido1 = "1234567890";
        System.out.println("cpf está válido? " + Utilitarios.validarCPF(cpfInvalido1));
        
        biblioteca.devolverEmprestimo(emprestimo);
        
        relatorio.gerarRelatorioEmprestimos(biblioteca.getEmprestimos());
        
        

        

      
    }
    
    
}
