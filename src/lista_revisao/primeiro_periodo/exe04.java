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

        float vet[] = new float[3];

        float media = mediaAritimetica(vet);
        mostrarResultado(media);

    }

    public static float mediaAritimetica(float[] vet) {
        Scanner in = new Scanner(System.in);
        int numero;
        float soma = 0;
        float media = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Informe um valor para o vetor: ");
            numero = in.nextInt();
            vet[i] = numero;
            soma = soma + vet[i];
            media = soma / vet.length;
        }

        return media;
    }

    public static void mostrarResultado(float value) {
        System.out.println(value);
    }

}