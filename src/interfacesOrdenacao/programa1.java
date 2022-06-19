package interfacesOrdenacao;

import interfacesOrdenacao.Entidades.Pessoa;

import java.util.Set;
import java.util.TreeSet;


public class programa1 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("José", 20);
        Pessoa p2 = new Pessoa("Maria", 40);
        Pessoa p3 = new Pessoa("Pedro", 30);

        Set<Pessoa> colecao = new TreeSet<Pessoa>();
        colecao.add(p1);
        colecao.add(p2);
        colecao.add(p3);

        //A lista será exibida por ordem de idade
        for(Pessoa p: colecao){
            System.out.printf("%d anos\n", p.getIdade());
        }
    }
}
