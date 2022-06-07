package Collections.Entidades;

public class Funcionario {
    private String nome;
    private Dependente dependente;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Dependente dependente) {
        this.nome = nome;
        this.dependente = new Dependente(dependente.getNome(),dependente.getIdade());
    }
    //Construtor Padrão
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
        e = new Dependente(e.getNome(), e.getIdade());
    }
    //Método para calcular a quantidade de dependentes cadastrados.
    public String quantidadeDependente(String nome, int qtd){
        if(qtd == 0){
            return (this.nome + " não possui dependente");
        }else{
            return this.nome + " " + qtd + " dependente(s)";
        }
    }

    @Override
    public String toString() {
        return "Funcionario " + nome;
    }
}
