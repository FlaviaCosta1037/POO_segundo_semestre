package lista03_classe_objects;

import lista03_classe_objects.Classes.Contato;
import lista03_classe_objects.Classes.Usuario;

import java.util.Locale;
import java.util.Scanner;

public class agenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.printf("===Dados Cadastrais do Usuário===\n");
        System.out.printf("Informe o seu nome: ");
        String nomeUsuario = in.nextLine();
        System.out.printf("Informe o seu cpf: ");
        Integer cpf = in.nextInt();


        System.out.printf("====Agenda de contatos====\n");
        System.out.printf("1 - Cadastro simples\n2 - Cadastro Completo\n3 - Encerrar programa\nDigite:  ");
        int opcao = in.nextInt();

        Usuario escolha = new Usuario();
        escolha.cadastro(opcao);

        System.out.printf("Informe quantos contatos serão cadastrados ");
        int quantidade = in.nextInt();

        Usuario usuario = new Usuario(nomeUsuario, cpf);

        Contato contatos = new Contato();
        contatos.interacaoUsuario(quantidade,opcao);
        contatos.imprimir();


    }
}

