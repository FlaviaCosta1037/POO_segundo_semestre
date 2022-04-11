package lista03_classe_objects;

import lista03_classe_objects.Classes.Contato;
import lista03_classe_objects.Classes.Usuario;

import java.util.Locale;
import java.util.Scanner;

public class agenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("=====Agenda=====");
        System.out.println("Informe seu nome: ");
        String nomeUsuario = in.nextLine();
        System.out.println("Informe seu CPF: ");
        int cpf = in.nextInt();

        Usuario usuario = new Usuario(nomeUsuario, cpf);

        System.out.println("Informe quantos contatos deseja cadastrar: ");
        int qtdContatos = in.nextInt();
        Contato contatos = new Contato();

        System.out.println("1-Cadastro Simples\n2- Cadastro completo\n3- Sair\nDigite: ");
        int opcao = in.nextInt();
        usuario.imprimir();
        contatos.selecionarCadastro(opcao);
        contatos.imprimir();


    }

}