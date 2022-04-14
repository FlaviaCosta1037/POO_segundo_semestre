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

        int encerrar = 0;
        Usuario escolhaEncerrar = new Usuario();

        Contato contatos = new Contato();

        Contato qtdContatos = new Contato();
        qtdContatos.contar(quantidade);

        String nomeContato[] = new String[quantidade];
        int idade[] = new int[quantidade];
        String sexo[] = new String[quantidade];
        int foneCel[] = new int[quantidade];
        String email[] = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {


            String nome = "", sexoContato = "", eMailContato = "";
            int idadeContato = 0, foneCelContato = 0;

            if (opcao == 1) {
                System.out.printf("Informe o nome do contato: ");
                nomeContato[i] = in.next();
                nome = nomeContato[i];

                System.out.printf("Deseja finalizar encerrar o cadastro? 1 - Não  2 - Sim ");
                encerrar = in.nextInt();

            } else if (opcao == 2) {
                System.out.printf("Informe o nome do contato: ");
                nomeContato[i] = in.next();
                nome = nomeContato[i];

                System.out.printf("Informe a idade do contato: ");
                idade[i] = in.nextInt();
                idadeContato = idade[i];

                System.out.printf("Informe o sexo do contato: ");
                sexo[i] = in.next();
                sexoContato = sexo[i];

                System.out.printf("Informe a Fone do contato: ");
                foneCel[i] = in.nextInt();
                foneCelContato = foneCel[i];

                System.out.printf("Informe o e-mail do contato: ");
                email[i] = in.next();
                eMailContato = email[i];

                System.out.printf("Deseja finalizar encerrar o cadastro? 1 - Não  2 - Sim ");
                encerrar = in.nextInt();
                contatos = new Contato(nome,idadeContato,sexoContato,foneCelContato,eMailContato);

            } else if (opcao == 3) {
                System.out.printf("Programa Finalizado!");
                break;
            }
            escolhaEncerrar.encerrar(encerrar, quantidade);
        }
        Usuario usuario = new Usuario(nomeUsuario, cpf);
        System.out.println(usuario);
        System.out.println(contatos);
    }
}

