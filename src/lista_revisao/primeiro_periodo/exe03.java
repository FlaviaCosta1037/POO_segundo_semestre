package lista_revisao.primeiro_periodo;
//Escreva um programa que receba do usuário um array de
// números e devolva a posição onde se encontra o maior valor do array.
//Usando modularização.

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        int vetNumeros[] = new int[3];

        int maiorIndex = indexM(vetNumeros);
        mostrarResultado(maiorIndex);

    }

    public static int indexM(int maior[]) {
        Scanner in = new Scanner(System.in);
        int maiorN = Integer.MIN_VALUE;
        int numero;
        int index = 0;
        int vetNumeros[] = new int[3];

        for (int i = 0; i < vetNumeros.length; i++) {

            System.out.println("Informe um valor: ");
            numero = in.nextInt();
            vetNumeros[i] = numero;

            if (vetNumeros[i] > maiorN) {
                maiorN = vetNumeros[i];
                index = i;
            }
        }
        return index;
    }

    public static void mostrarResultado(int value) {
        System.out.println("O indice com maior valor é: " + value);
    }

}