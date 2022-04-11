package lista03_classe_objects.Classes;

import java.util.Arrays;

public class Usuario {
    private String nome;
    private Integer cpf;
    private Contato[] contatos;

    public Usuario() {

    }

    public Usuario(String nome, Integer cpf, Contato[] contatos) {
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

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", contatos=" + Arrays.toString(contatos) +
                '}';
    }
}
