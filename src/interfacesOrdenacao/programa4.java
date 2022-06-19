package interfacesOrdenacao;

import interfacesOrdenacao.Entidades.CompareContaNome;
import interfacesOrdenacao.Entidades.Conta;

import java.util.*;

public class programa4 {
    public static void main(String[] args) {

        Collection<Conta> contas = new ArrayList<>();
        Conta conta1 = new Conta(551251,"Flavia Gonçalves");
        Conta conta2 = new Conta(551249, "Rita Costa");
        Conta conta3 = new Conta(551267, "Patricia Freitas");
        Conta conta4 = new Conta(551349,"Doralice Bezerra");

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        System.out.println("Lista sem ordem");
        System.out.println("=====================================");
        for(Conta lista : contas){
            System.out.println(lista.getTitular());
        }

        System.out.println("\nLista ordenada por ordem alfabética");
        System.out.println("=====================================");
        CompareContaNome contasTitular = new CompareContaNome();
        Set<Conta> listaContas = new TreeSet<>(contasTitular);

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);

        for(Conta lista2 : listaContas){
            System.out.println(lista2.getTitular());
        }

        System.out.println("\nLista ordenada por ordem de conta");
        System.out.println("=====================================");
        Set<Conta> contas3 = new TreeSet<Conta>();
        contas3.add(conta1);
        contas3.add(conta2);
        contas3.add(conta3);
        contas3.add(conta4);

        for(Conta lista3: contas3){
            System.out.println(lista3.getNumero() + " " + lista3.getTitular());
        }

    }
}
