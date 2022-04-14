package lista03_classe_objects.Classes;

import java.util.Scanner;

public class Contato {
    Scanner in = new Scanner(System.in);
    private String nome;
    private int idade;
    private String sexo;
    private int foneCel;
    private String eMail;

    //Construtor Padrão
    public Contato() {

    }

    public Contato(String nome) {
        this.nome = nome;
    }

    public Contato(String nome, int idade, String sexo, int foneCel, String eMail) {
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

    public int getFoneCel() {
        return this.foneCel;
    }

    public void setFoneCel(int foneCel) {
        this.foneCel = foneCel;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int contar(int quantidade) {
        quantidade = 0;
        return quantidade += quantidade;
    }

    public String toString(){
        String imprimir = "";
        for(int i = 0; i < this.nome.length();i++){
            if(this.idade == 0){
                imprimir = String.format("Nome: %s\n",this.nome);
            }else{
                imprimir = String.format("Nome: %s\n Idade: %d\n Sexo: %s\n Fone: %d\n E-mail: %s\n",
                        this.nome,this.idade,this.sexo,this.foneCel,this.eMail);
            }
        }
        return imprimir;
    }
}