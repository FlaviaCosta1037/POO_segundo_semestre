package lista_02_classesObjects;

import lista_02_classesObjects.classes.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class program_imc {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o nome do usuário: ");
        String usuario = in.next();
        System.out.println("Informe a idade do usuário: ");
        int idade = in.nextInt();
        System.out.println("Informe a altura do usuário: ");
        Double altura = in.nextDouble();
        System.out.println("Informe o peso do usuário: ");
        int peso = in.nextInt();
        System.out.println("Informe o sexo do usuário: ");
        String sexo = in.next();

        Pessoa pessoa = new Pessoa(usuario, idade,altura, peso,sexo);

        pessoa.calculaImc();
        pessoa.imprimeDados();

    }
}
