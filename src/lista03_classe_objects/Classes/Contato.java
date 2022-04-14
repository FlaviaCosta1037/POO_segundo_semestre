package lista03_classe_objects.Classes;

import java.text.Format;
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

    public int contar(int quantidade){
        return quantidade;
    }

    @Override
    public String toString() {
        StringBuilder imprimir = new StringBuilder();
        int quantidade = 0;
        quantidade  = contar(quantidade);

        for(int i = 0; i < quantidade; i++){
            if(this.idade == 0){
                imprimir.append("Nome do Contato: ").append(getNome());
            }else{
                imprimir.append("Nome do Contato: ").append(getNome()).append("Idade: ").
                        append(getIdade()).append("Sexo: ").append(getSexo()).append("Fone: ").
                        append(getFoneCel()).append("E-mail: ").append(geteMail());
            }
        }

        return imprimir.toString();
    }
}
