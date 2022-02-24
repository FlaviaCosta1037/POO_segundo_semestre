package lista_revisao.primeiro_periodo;

import java.util.Locale;
import java.util.Scanner;
   /*Faça um programa que receba uma frase e uma palavra.
    Calcule e mostre a quantidade de vezes que a palavra digitada aparece na frase.*/

public class exe07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String receberFrase; //Vetor para receber a frase digitada pelo usuário
        String palavra; //Palavra escolhida para procura
        int quantidade = 0; //Contador da quantidade que se repete a palavra procurada

        System.out.println("Digite uma frase: ");
        receberFrase = in.nextLine();

        System.out.println("Digite uma palavra: ");
        palavra = in.next();

        //Laço de repetição para contar a quantidade de vezes que a string se repetiu.
        //substring = método que identifica uma string dentro de uma frase
        //startsWith = método que especifica se a string começa com os caracteres especificados. (ex: palavra informada
        //pelo usuário.

        for (int i = 0; i < receberFrase.length(); i++){
            if(receberFrase.substring(i).startsWith(palavra)){
                quantidade++;
            }
        }
        System.out.println(quantidade);

    }
}