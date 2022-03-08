package lista02_classesObjetos;

import lista02_classesObjetos.entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class calculo_imc {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o nome: ");
        pessoa.nome = in.nextLine();
        System.out.println("Informe a idade: ");
        pessoa.idade = in.nextInt();
        System.out.println("Informe a altura: ");
        pessoa.altura = in.nextDouble();
        System.out.println("Informe o peso: ");
        pessoa.peso = in.nextInt();
        System.out.println("Informe o sexo: ");
        pessoa.sexo = in.next();

        System.out.println("Resultado\n======================");
        String nome = "";
        Integer idade = 0;
        double imc = 0;
        pessoa.imprimeDados(nome, idade, imc);
        System.out.println("\n======================");
    }
}
