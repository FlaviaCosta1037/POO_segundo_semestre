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
        System.out.printf("1 - Cadastro simples\n2 - Cadastro Completo\nDigite:  ");
        int opcao = in.nextInt();

        Contato escolha = new Contato();
        escolha.cadastro(opcao);

        System.out.printf("Informe quantos contatos serão cadastrados ");
        int quantidade = in.nextInt();

        Contato contatos[] = new Contato[quantidade];

        for(int i = 0; i < contatos.length; i++){
            if(opcao == 1){
                System.out.printf("Informe o nome do contato: ");
                String nome = in.nextLine();
                in.next();
                Contato lista = new Contato(nome);
                lista.imprimirSimples();

            }else if(opcao == 2) {
                System.out.printf("Informe o nome do contato: ");
                String nome = in.nextLine();
                in.next();

                System.out.printf("Informe a idade: ");
                int idade = in.nextInt();

                System.out.printf("Informe o sexo do contato: F/M/Outros ");
                String sexo = in.nextLine();
                in.next();

                System.out.printf("Informe o fone: ");
                int fone = in.nextInt();

                System.out.printf("Informe o E-mail do contato: ");
                String eMail = in.nextLine();
                in.next();

                Contato lista = new Contato(nome,idade,sexo,fone,eMail);


            }

        }

    }
}



