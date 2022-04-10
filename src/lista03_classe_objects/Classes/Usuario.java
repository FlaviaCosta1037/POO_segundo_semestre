package lista03_classe_objects.Classes;

import java.util.Arrays;
import java.util.Scanner;


public class Usuario {

    public String nome;
    public int cpf;
    public Contato[] contato = null;

    public Usuario(String nome, int cpf, Contato[] contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    public Usuario (String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.printf("Nome: %s  CPF: %d  Contatos: %s", this.nome, this.cpf);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", contato=" + Arrays.toString(contato) +
                '}';
    }
}
