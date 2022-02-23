package lista_revisao.primeiro_periodo;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa principal que defina um array de inteiros e chame três funções passando
por parâmetro o array definido. No final, imprima o resultado das funções na tela.
a. Uma função para calcular a média e retorná-la.
b. Uma função para encontrar o maior valor e retorná-lo.
c. Uma função para encontrar o menor valor e retorná-lo.
*/
public class exe06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        float media, maior, menor, numero;
        int quantidade;

        System.out.println("Informe a quantidade de valores: ");
        quantidade = in.nextInt();
        float vet [] = new float[quantidade];

        for(int i = 0; i < vet.length; i++){
            System.out.println("Informe um número: ");
            numero = in.nextFloat();
            vet[i] = numero;
        }

        float resultadoDaMedia = media(vet);
        float maiorValor = maiorValor(vet);
        float menorValor = menorValor(vet);

        System.out.printf("O resultado da média é %.2f:\n", resultadoDaMedia);
        System.out.println("O maior valor do vetor é: " + maiorValor);
        System.out.println("O maior valor do vetor é: " + menorValor);
    }
    public static float media(float vetMedia[]){
        float resultadoMedia = 0;
        float soma = 0;

        for(int i = 0; i < vetMedia.length; i++){
            soma += vetMedia[i];
            resultadoMedia = soma / vetMedia.length;
        }
        return resultadoMedia;
    }
    public static float maiorValor (float vetMaiorValor[]){
        float maior = Integer.MIN_VALUE;

        for(int i = 0; i < vetMaiorValor.length; i++){
            if(vetMaiorValor[i] > maior){
                maior = vetMaiorValor[i];
            }
        }
        return maior;
    }
    public static float menorValor (float vetMenorValor[]){
        float menor = Integer.MAX_VALUE;

        for(int i = 0; i < vetMenorValor.length; i++){
            if(vetMenorValor[i] < menor){
                menor = vetMenorValor[i];
            }
        }
        return menor;
    }
}