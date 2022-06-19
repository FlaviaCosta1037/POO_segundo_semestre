package interfacesOrdenacao;

import interfacesOrdenacao.Entidades.CompararNome;
import interfacesOrdenacao.Entidades.Pessoa;

import java.util.Set;
import java.util.TreeSet;

public class programa3 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("José", 20);
        Pessoa p2 = new Pessoa("Maria", 40);
        Pessoa p3 = new Pessoa("Pedro", 30);


        CompararNome comparador = new CompararNome();
        Set<Pessoa> colecao = new TreeSet<Pessoa>(comparador);
        colecao.add(p1);
        colecao.add(p2);
        colecao.add(p3);
        for(Pessoa p: colecao){
            System.out.printf("%s \n", p.getNome());
        }
    }
}
