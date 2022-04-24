package revisao_prova;

//Revisando métodos staticos

import revisao_prova.Classes.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class mainCalculadora {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("=======Calculadora======");
        System.out.println("Informe a operação que deseja realizar\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\nDigite:  ");
        int opcao = in.nextInt();

        System.out.println("Informe os numeros: ");
        double numero1 = in.nextDouble();
        double numero2 = in.nextDouble();

        switch (opcao){
            case 1:
                System.out.println(Calculadora.somar(numero1,numero2));
                break;
            case 2:
                System.out.println(Calculadora.subtrair(numero1,numero2));
                break;
            case 3:
                System.out.println(Calculadora.multiplicar(numero1,numero2));
                break;
            case 4:
                System.out.println(Calculadora.dividir(numero1,numero2));
                break;
            default:
                System.out.println("Opcão inválida! ");
        }
    }
}
