package interfacesOrdenacao;

import interfacesOrdenacao.Entidades.Pessoa2;

import java.util.Set;
import java.util.TreeSet;

public class programa2 {
    public static void main(String[] args) {
        Pessoa2 p1 = new Pessoa2("Flávia","Costa");
        Pessoa2 p2 = new Pessoa2("Cassia","Gonçalves");
        Pessoa2 p3 = new Pessoa2("Patricia", "Freitas");
        Pessoa2 p4 = new Pessoa2("Flávia","Amadeu");

        Set<Pessoa2> colecao = new TreeSet<Pessoa2>();
        colecao.add(p1);
        colecao.add(p2);
        colecao.add(p3);
        colecao.add(p4);

        //Exibirá a lista de nome e sobrenome em ordem alfabética
        for(Pessoa2 p : colecao){
            System.out.println(p.getNome() + " " +  p.getSobrenome());
        }
    }
}
