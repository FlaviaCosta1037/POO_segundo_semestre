package exercicios_loiane;

import exercicios_loiane.Classes.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class program_calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        //Interação com o usuário: Selecione a opção aritimética.
        System.out.printf("Qual operação deseja fazer? ");
        System.out.printf("\nDigite 1 - Soma\nDigite 2 - Subtrair\nDigite 3 - Dividir\nDigite 4 - Multiplicar\nDigite 5 - Fatorial\nDigite: ");
        int opcao = in.nextInt();
        Double resultado = 0.0;
        int fatorial = 0;

        //Estrutura de decisão para o resultado da operação aritimética escolhida.
        if (opcao == 1) {
            //Interação com o usuário: Informe dois numeros para calculos aritiméticos.
            System.out.println("Informe um numero: ");
            Double n1 = in.nextDouble();
            System.out.println("Informe um numero: ");
            Double n2 = in.nextDouble();
            resultado = Calculadora.somar(n1, n2); //Chamada do método soma
            System.out.printf("Você escolheu a opção de soma\n");
            Calculadora.imprimir(resultado); //Chamada do Método de impressão

        } else if (opcao == 2) {
            //Interação com o usuário: Informe dois numeros para calculos aritiméticos.
            System.out.println("Informe um numero: ");
            Double n1 = in.nextDouble();
            System.out.println("Informe um numero: ");
            Double n2 = in.nextDouble();
            resultado = Calculadora.subtrair(n1, n2); //Chamada do método subtração
            System.out.printf("Você escolheu a opção de subtração\n");
            Calculadora.imprimir(resultado);

        } else if (opcao == 3) {
            //Interação com o usuário: Informe dois numeros para calculos aritiméticos.
            System.out.println("Informe um numero: ");
            Double n1 = in.nextDouble();
            System.out.println("Informe um numero: ");
            Double n2 = in.nextDouble();
            resultado = Calculadora.dividir(n1, n2); //Chamada do método divisão
            System.out.printf("Você escolheu a opção de divisão\n");
            Calculadora.imprimir(resultado);

        } else if (opcao == 4) {
            //Interação com o usuário: Informe dois numeros para calculos aritiméticos.
            System.out.println("Informe um numero: ");
            Double n1 = in.nextDouble();
            System.out.println("Informe um numero: ");
            Double n2 = in.nextDouble();
            resultado = Calculadora.multiplicar(n1, n2); //Chamada do método multiplicação
            System.out.printf("Você escolheu a opção de multiplicação\n");
            Calculadora.imprimir(resultado);

        } else if(opcao == 5){
            System.out.printf("Informe um número para calcular o fatorial: ");
            int numero = in.nextInt();
            fatorial = Calculadora.fatorial(numero);
            System.out.println(fatorial);
        }

    }
}