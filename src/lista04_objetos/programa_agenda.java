package lista04_objetos;

import lista04_objetos.Classes.Contato;
import lista04_objetos.Classes.Usuario;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class programa_agenda {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("===========Agenda===========");
        System.out.println("Informe seu nome: ");
        String nome = in.nextLine();
        System.out.println("Informe seu Cpf: ");
        int cpf = in.nextInt();

        Usuario usuario = new Usuario(nome,cpf);

        System.out.println("Inicie o cadastros dos seus contatos...");
        System.out.println("Informe quantos contatos deseja cadastrar");
        int qtd = in.nextInt();
        System.out.println("Selecione:\n(1) Cadastro Simples\n(2) Cadastro Completo\n");
        int opcao = in.nextInt();

        Contato contatos[] = new Contato[qtd];
        usuario.escolhaCadastro(opcao);
        usuario.dadosContato();
    }
}
