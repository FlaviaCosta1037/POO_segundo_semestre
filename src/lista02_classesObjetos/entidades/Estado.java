package lista02_classesObjetos.entidades;

import java.util.Arrays;

//Criado objeto estado com os atributos.
public class Estado {
    public String nome;
    public String capital;
    public String[] cidades;
    public double dimensao;

    //Criado construtor do objeto Estado.
    public Estado(String nome, String capital, String[] cidades, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.cidades = cidades;
        this.dimensao = dimensao;
    }

    //Método que retorna a quantidade de cidades da Classe Estado.
    public int qtdCidades(){
        return this.cidades.length;
    }

    public void printEstado(){
        System.out.printf("Estado: %s\n Capital: %s\n Cidades %s Dimensao: %s",this.nome, this.capital, this.cidades, this.dimensao);
    }

    @Override
    public String toString() {
        return "Dimensao: " + dimensao;
    }
}
