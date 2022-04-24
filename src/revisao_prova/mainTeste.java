package revisao_prova;

import revisao_prova.Classes.*;

import java.util.Locale;
import java.util.Scanner;

public class mainTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Ingresso ingresso = new Ingresso(0.0);

        System.out.println("Escolha o tipo de ingresso que você deseja adquirir:\n1 - Ingresso Simples\n2 - Ingresso vip\nDigite: ");
        int opcao = in.nextInt();
        int escolha;

        if (opcao == 1) {
            System.out.println("Você escolheu um ingresso simples.");
            System.out.println(ingresso = new Simples(100.00));
        } else if (opcao == 2) {
            System.out.println("Escolha o tipo de camarote: \n1 - Camarote inferior\n2 - Camarote superior\nDigite: ");
            escolha = in.nextInt();

            switch (escolha){
                case 1:
                ingresso = new CamaroteInferior(200.00,50.00,"A200");
                System.out.println(ingresso);
                break;
                case 2:
                    ingresso = new CamaroteSuperior(300.00,50.00,"A400");
                    System.out.println(ingresso);
            }

        }
    }
}