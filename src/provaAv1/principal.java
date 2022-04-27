package provaAv1;

import provaAv1.Classes.Copo;

import java.util.Locale;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Copo copoA = new Copo(500,500,"azul");
        Copo copoB = new Copo(600,0,"amarelo");

        copoA.obterInformacoes();
        copoB.obterInformacoes();

        copoA.esvaziar();
        copoB.adicionarLiquido(300);

        copoA.obterInformacoes();
        copoB.obterInformacoes();
    }
}