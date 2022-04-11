package lista03_classe_objects.Classes;

import java.util.Scanner;

public class Contato {
    Scanner in = new Scanner(System.in);
    private String nome;
    private Integer idade;
    private String sexo;
    private Integer foneCel;
    private String eMail;

    public Contato() {

    }

    public Contato(String nome) {
        this.nome = nome;
    }

    public Contato(String nome, Integer idade, String sexo, Integer foneCel, String eMail) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.foneCel = foneCel;
        this.eMail = eMail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getFoneCel() {
        return foneCel;
    }

    public void setFoneCel(Integer foneCel) {
        this.foneCel = foneCel;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void cadastro(int opcao) {
        switch (opcao) {
            case 1:
                System.out.printf("Cadastro simples\n");
                break;
            case 2:
                System.out.printf("Cadastro completo\n");
                break;
        }
    }
    public void imprimirSimples(){
        System.out.println(this.nome);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", foneCel=" + foneCel +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
