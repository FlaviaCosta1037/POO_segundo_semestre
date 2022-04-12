package lista03_classe_objects.Classes;

import java.util.Arrays;

public class Usuario {
    private String nome;
    private Integer cpf;
    private Contato[] contatos;

    public Usuario() {

    }

    public Usuario(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Usuario(String nome, Integer cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    //Método para escolha do cadastro
    public int cadastro(int opcao) {
        switch (opcao) {
            case 1:
                System.out.printf("Cadastro simples\n");
                break;
            case 2:
                System.out.printf("Cadastro completo\n");
                break;
        }
        return opcao;
    }

    public int encerrar(int opcao, int quantidade) {
        for (int i = 0; i < quantidade; i++)
            if (opcao == 1) {
                continue;
            } else if (opcao == 2) {
                System.out.printf("Programa encerrado!");
                break;
            }
        return opcao;
    }


    public void contato(String nome, int idade, String sexo, int fone, String eMail){
        contatos = new Contato[contatos.length];
        for(int i = 0; i < contatos.length; i++){

        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf;
    }
}
