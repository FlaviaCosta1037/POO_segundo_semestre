package lista_revisao.primeiro_periodo;
//Escrever um programa que lê 10 números inteiros e armazene esses valores em um
//array. O programa deve calcular a média aritmética dos valores do vetor e imprimir na
//tela todos os valores menores do que a média calculada. Use modularização.

import java.util.Locale;
import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int vet[] = new int[3];
        int numero;
        int soma = 0;
        float media = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe um valor para o vetor: ");
            numero = in.nextInt();
            vet[i] = numero;
            soma = soma + vet[i];
            media = soma / vet.length;
        }
        System.out.println(soma);
        System.out.println(media);

    }

}