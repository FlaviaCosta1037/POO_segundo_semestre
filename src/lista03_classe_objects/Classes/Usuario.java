package lista03_classe_objects.Classes;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {

    private String nome;
    private int cpf;
    private Contato[] contato;

    public Usuario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Usuario(String nome, int cpf, Contato[] contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }

    public void contatos(){
        Contato contatos = new Contato();
        contatos.getNome();
        contatos.geteMail();
        contatos.getSexo();
        contatos.getIdade();
        contatos.getFoneCelular();
    }
    public void imprimir(){
        System.out.printf("Nome usuário: %s  Cpf: %d ", this.nome, this.cpf);
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
