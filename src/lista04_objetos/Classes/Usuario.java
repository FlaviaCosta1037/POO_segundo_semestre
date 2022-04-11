package lista04_objetos.Classes;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {
    Scanner in = new Scanner(System.in);
    public String nome;
    public int cpf;
    public Contato[] contatos;

    public Usuario(String nome, int cpf, Contato[] contatos) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
    }

    public Usuario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Usuario(Contato[] contatos) {
        this.contatos = contatos;
    }

    /*public void escolhaCadastro(int quantidade) {
        String nome = "", sexo = "", email = "";
        int idade = 0, fone = 0;
        if (quantidade == 1) {
            System.out.println("Informe o nome do contato: ");
            nome = in.nextLine();
            Contato contatoNome = new Contato(nome);

        } else if (quantidade == 2) {
            System.out.println("Informe o nome do contato: ");
            nome = in.nextLine();
            System.out.println("Informe o sexo do contato: ");
            sexo = in.nextLine();
            System.out.println("Informe o e-mail do contato: ");
            email = in.nextLine();
            System.out.println("Informe a idade do contato: ");
            idade = in.nextInt();
            System.out.println("Informe o telefone do contato: ");
            fone = in.nextInt();
            Contato contatoCompleto = new Contato(nome, idade, sexo, fone, email);
        }

    }*/


    public void informacoes(int quantidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = new Contato[quantidade];
    }

    public void continuar() {
        System.out.println("Deseja continuar cadastrando outros contatos? (1)-Sim\n(2)Não");
        int opcao = in.nextInt();
        if (opcao == 1) {

        } else if (opcao == 2) {
            System.out.println("Programa finalizado!");
        }
    }

    public void imprimirUsuario() {
        System.out.printf("Usuário: %s\nCpf: %d\n", this.nome, this.cpf);
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "Nome: " + nome + '\'' +
                ", CPF: " + cpf;
    }
}
