package lista03_classe_objects.Classes;

import java.util.Arrays;

public class Usuario {
    private String nome;
    private String cpf;
    private Contato[] contatos;

    public Usuario() {

    }

    public Usuario(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public Usuario(String nome, String cpf, Contato[] contatos) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    //Métoco para imprimir o objeto com laço for lendo todos os contatos.
    public String toString() {
        String stringContatos = "";

        for (Contato contato: contatos) {
            stringContatos += contato;
        }
        //Retorno do usuário, cpf e array de contatos.
        return "Usuário: " + this.nome + " Cpf: " + this.cpf + "\n===Agenda===\n" + stringContatos;

    }
}
