package Collections.Entidades;

public class Dependente extends Funcionario {
    private Integer idade;

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

    public void dependenteMaisVelho(int[] idades){
        int maior = 0;
        for(int idade: idades){
            if(idade > maior){
                maior = idade;
            }
        }
        System.out.println("A maior idade é: " + maior);
    }
}
