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
        String cpf = in.next();

        System.out.printf("====Agenda de contatos====\n");
        System.out.printf("1 - Cadastro simples\n2 - Cadastro Completo\n3 - Encerrar programa\nDigite:  ");
        int opcao = in.nextInt();

        //Opção para escolher o tipo de cadastro
        switch (opcao){
            case 1:
                System.out.println("Cadastro Simples");
                break;
            case 2:
                System.out.println("Cadastro Completo");
                break;
        }

        //Determinar a quantidade de contatos da agenda
        System.out.printf("Informe quantos contatos serão cadastrados ");
        int quantidade = in.nextInt();

        String nomeContato, sexo, email, foneCel;
        int idade;

        //Instanciar o array de contatos
        Contato contatos[] = new Contato[quantidade];

        //Laço for para receber os dados dos contatos
        for (int i = 0; i < contatos.length; i++) {
            if (opcao == 1) {
                System.out.printf("Informe o nome do contato: ");
                nomeContato = in.next();
                contatos[i] = new Contato(nomeContato);

            } else if (opcao == 2) {
                System.out.printf("Informe o nome do contato: ");
                nomeContato = in.next();

                System.out.printf("Informe a idade do contato: ");
                idade = in.nextInt();

                System.out.printf("Informe o sexo do contato: ");
                sexo = in.next();

                System.out.printf("Informe a Fone do contato: ");
                foneCel= in.next();

                System.out.printf("Informe o e-mail do contato: ");
                email = in.next();

                contatos[i] = new Contato(nomeContato,idade,sexo,foneCel,email);

            } else if (opcao == 3) {
                System.out.printf("Programa Finalizado!");
                break;
            } else {
                System.out.println("Opção incorreta! ");
            }

            //Estrutura para definir se continua ou para o cadastro. (Se o contador for diferente da quantidade definida menos 1
            if(i != quantidade - 1){
                System.out.printf("Deseja finalizar encerrar o cadastro? 1 - Não  2 - Sim 3 - Encerrar cadastro ");
                int escolha = in.nextInt();

            }else{
                System.out.println("Cadastro Finalizado.");
            }
        }

        Usuario usuario = new Usuario(nomeUsuario, cpf,contatos);
        System.out.println(usuario);
    }
}

