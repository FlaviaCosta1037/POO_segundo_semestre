package lista_revisao.primeiro_periodo;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que compara dois vetores (A e B) e exibe na tela um terceiro vetor (C)
// contendo a interseção dos valores de A e B. Declare e inicialize os vetores A e B com
// 5 números inteiros cada. Use modularização.

public class exe05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int vC[] = {};

        int elementosVetorC = compararVetor(vC);

    }

    public static int compararVetor(int[] vetC) {
        int vetA[] = {1, 2, 3, 6};
        int vetB[] = {1, 2, 3, 4, 6};
        int vC = 0;


        for (int i = 0; i < vetA.length; i++) {
            for (int j = 0; j < vetB.length; j++) {
                if (vetA[i] == vetB[j]) {
                    vC = vetA[i];
                }
            }
            System.out.println(vC);
        }
        return vC;
    }
}



