package interface_abstrato;

import interface_abstrato.Classes.*;

import java.util.Locale;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        Soma soma = new Soma();
        System.out.println(soma.calcula(n1,n2));

        Subtracao sub = new Subtracao();
        System.out.println(sub.calcula(n1,n2));

        Multiplicacao mult = new Multiplicacao();
        System.out.println(mult.calcula(n1,n2));

        Divisao div = new Divisao();
        System.out.println(div.calcula(n1,n2));

        OperacaoMatematica op = new Soma();
        System.out.println(op.calcula(n1,n2));

    }
}
