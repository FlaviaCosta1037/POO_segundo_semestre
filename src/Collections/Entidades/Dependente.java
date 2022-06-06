package Collections.Entidades;

public class Dependente extends Funcionario {
    private int idade;

    public Dependente(String nome) {
        super(nome);

    }
    public Dependente(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nDependente: " + getNome() + "\nIdade: " + getIdade();
    }
}
