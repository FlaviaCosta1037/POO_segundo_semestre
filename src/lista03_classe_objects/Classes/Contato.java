package lista03_classe_objects.Classes;

import java.util.Scanner;

public class Contato {
    Scanner in = new Scanner(System.in);
    private String nome;
    private int idade;
    private String sexo;
    private int foneCelular;
    private String eMail;

    public Contato(){

    }

    public Contato(Scanner in, String nome, int idade, String sexo, int foneCelular, String eMail) {
        this.in = in;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.foneCelular = foneCelular;
        this.eMail = eMail;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(int foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void selecionarCadastro(int opcao){

        if(opcao == 1){
            System.out.printf("Informe o nome do contato: ");
            String nome = in.nextLine();
            this.nome = nome;

        } else if(opcao == 2){
            System.out.println("Informe o nome do contato:");
            String nome = in.nextLine();
            this.nome = nome;

            System.out.println("Informe o e-mail: ");
            String eMail = in.nextLine();
            this.eMail = eMail;

            System.out.println("Informe o sexo:\nFeminino\nMasculino\nOutros Digite:  ");
            String sexo = in.nextLine();
            this.sexo = sexo;

            System.out.println("Informe a idade: ");
            int idade = in.nextInt();
            this.idade = idade;

            System.out.println("Informe o numero do celular: ");
            int foneCelular = in.nextInt();
            this.foneCelular = foneCelular;
        }
    }

    public void imprimir(){
        System.out.printf("Contato: %s\nE-mail: %s\nSexo: %s\nIdade: %d\nFoneCelular: %d\n",
                this.nome, this.eMail, this.sexo, this.idade, this.foneCelular);
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
