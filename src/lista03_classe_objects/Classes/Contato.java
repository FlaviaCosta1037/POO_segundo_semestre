package lista03_classe_objects.Classes;

import java.util.Scanner;

public class Contato {
    Scanner in = new Scanner(System.in);
    private String nome[];
    private int[] idade;
    private String sexo[];
    private int foneCel[];
    private String eMail[];

    //Construtor Padrão
    public Contato() {

    }

    public Contato(String[] nome) {
        this.nome = nome;
    }

    public Contato(String nome[], int idade[], String sexo[], int foneCel[], String eMail[]) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.foneCel = foneCel;
        this.eMail = eMail;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public String[] getSexo() {
        return sexo;
    }

    public void setSexo(String[] sexo) {
        this.sexo = sexo;
    }

    public int[] getFoneCel() {
        return foneCel;
    }

    public void setFoneCel(int[] foneCel) {
        this.foneCel = foneCel;
    }

    public String[] geteMail() {
        return eMail;
    }

    public void seteMail(String[] eMail) {
        this.eMail = eMail;
    }

    public void interacaoUsuario(int quantidade, int opcao){

        int encerrar = 0;
        Usuario escolhaEncerrar = new Usuario();

        String nomeContato[] = new String[quantidade];
        int idade[] = new int [quantidade];
        String sexo[] = new String[quantidade];
        int foneCel[] = new int[quantidade];
        String email[] = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {

            if (opcao == 1) {
                System.out.printf("Informe o nome do contato: ");
                nomeContato[i] = in.next();
                System.out.printf("Deseja finalizar encerrar o cadastro? 1 - Não  2 - Sim ");
                encerrar = in.nextInt();
                this.nome = nomeContato;

            } else if (opcao == 2) {
                System.out.printf("Informe o nome do contato: ");
                nomeContato[i] = in.next();
                this.nome = nomeContato;

                System.out.printf("Informe a idade do contato: ");
                idade[i] = in.nextInt();
                this.idade = idade;

                System.out.printf("Informe o sexo do contato: ");
                sexo[i] = in.next();
                this.sexo = sexo;

                System.out.printf("Informe a Fone do contato: ");
                foneCel[i] = in.nextInt();
                this.foneCel = foneCel;

                System.out.printf("Informe o e-mail do contato: ");
                email[i] = in.next();
                this.eMail = email;

                System.out.printf("Deseja finalizar encerrar o cadastro? 1 - Não  2 - Sim ");
                encerrar = in.nextInt();

            } else if (opcao == 3) {
                System.out.printf("Programa Finalizado!");
                break;
            }
            escolhaEncerrar.encerrar(encerrar, quantidade);
        }
    }
    //Método para imprimir o nome simples.

    public void imprimir() {
        if(this.idade.length == 0){

            System.out.printf("Nome: %s\n", this.nome);
        }else{
            System.out.printf("Nome: %s\nIdade: %d\n Sexo: %s\n FoneCel: %d\n E-mail: %s\n ",
                    this.nome, this.idade, this.sexo, this.foneCel, this.eMail);
        }
    }
    @Override
    public String toString() {
        String imprimir;
        if(this.idade.length == 0){
            imprimir = "Nome do Contato: " + this.nome;
        }else{
            imprimir = "Nome do Contato: " + this.nome + "Idade: " + this.idade +
                    "Sexo: " + this.sexo + "Fone: " + this.foneCel + "E-mail: " + this.eMail;
        }
        return imprimir;
    }
}
