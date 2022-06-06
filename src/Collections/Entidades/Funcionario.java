package Collections.Entidades;

import Collections.Servicos.Cadastrar;

public class Funcionario {
    private String nome;
    private Dependente dependente;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Dependente dependente) {
        this.nome = nome;
        this.dependente = dependente;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public void addDependente(Dependente e){
        e = new Dependente(getNome(), e.getIdade());
        e.getNome();
        e.getIdade();
    }

    @Override
    public String toString() {
        return "Funcionario " + nome;
    }
}
