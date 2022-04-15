package lista03_classe_objects.Classes;

import java.util.Scanner;

public class Contato {
    Scanner in = new Scanner(System.in);
    private String nome;
    private int idade;
    private String sexo;
    private String foneCel;
    private String eMail;

    //Construtor Padrão
    public Contato() {

    }

    public Contato(String nome) {
        this.nome = nome;
    }

    public Contato(String nome, int idade, String sexo, String foneCel, String eMail) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.foneCel = foneCel;
        this.eMail = eMail;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFoneCel() {
        return this.foneCel;
    }

    public void setFoneCel(String foneCel) {
        this.foneCel = foneCel;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    //Metodo com estrutura if e else para imprimir cadastro simples e completo.
    public String toString() {
        String stringContatos = "";

        if (this.idade == 0) {
            stringContatos = "\nNome: " + this.nome;
        } else {
            stringContatos = "\nNome: " + this.nome + "\nIdade: " + this.idade + "Sexo: "
                    + this.sexo + "\nFone: " + this.foneCel + "\nE-mail: " + this.eMail + "\n=============";
        }
        return stringContatos;
    }
}