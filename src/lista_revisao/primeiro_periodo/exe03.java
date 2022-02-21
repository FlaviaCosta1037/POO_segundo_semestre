package lista_revisao.primeiro_periodo;
//Escreva um programa que receba do usuário um array de
// números e devolva a posição onde se encontra o maior valor do array.

import java.util.Locale;
import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int numero;
        int maior = 0;
        int vetNumeros[] = new int[3];


        for (int i = 0; i < vetNumeros.length; i++) {
            System.out.println("Informe um valor: ");
            numero = in.nextInt();
            vetNumeros[i] = numero;

            if (vetNumeros[i] > maior) {
                maior = vetNumeros[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
    }
}