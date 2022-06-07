package Collections.Entidades;

import java.util.ArrayList;
import java.util.List;

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

    //Método para informar o dependente cadastrado mais velho.
    public void dependenteMaisVelho(int idade){
        Integer maiorIdade = 0;
        List<Integer> listaIdades = new ArrayList<>();
        listaIdades.add(idade);
        for(int idades: listaIdades){
            if(idades > maiorIdade){
                maiorIdade = idades;
            }
        }
        System.out.println("Dependente com maior idade: " + getNome() + " " + maiorIdade + " anos.");
    }
}
