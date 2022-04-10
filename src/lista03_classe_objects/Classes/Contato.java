package lista03_classe_objects.Classes;

import java.util.Scanner;

public class Contato {
    Scanner in = new Scanner(System.in);
    public String nome;
    public int idade;
    public String sexo;
    public int foneCelular;
    public String eMail;

    public Contato(String nome){
        this.nome = nome;
    }
    public Contato(String nome, int idade, String sexo, int foneCelular, String eMail) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.foneCelular = foneCelular;
        this.eMail = eMail;
    }
    public static void cadSimples(int opcao){
        Scanner in = new Scanner(System.in);
        if(opcao == 1){
            System.out.println("Informe o nome do contato:");
            String nome = in.nextLine();

        }
    }
    public static void cadCompleto(int opcao){
        Scanner in = new Scanner(System.in);
        int idade, foneCelular; int sexo; String eMail;
        if(opcao == 2){
            System.out.println("Informe o nome do contato:");
            String nome = in.nextLine();

            System.out.println("Informe o e-mail: ");
            eMail = in.nextLine();

            System.out.println("Informe a idade: ");
            idade = in.nextInt();

            System.out.println("Informe o sexo:\n1- Feminino\n2- Masculino\n3- Prefiro não dizer\n ");
            sexo = in.nextInt();

            System.out.println("Informe o numero do celular: ");
            foneCelular = in.nextInt();

        }
    }

    public static void sair(int opcao){
        Scanner in = new Scanner(System.in);
        if(opcao == 3){
            System.out.println("Programa finalizado");
        }
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", foneCelular=" + foneCelular +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
