package interface_abstrato;

import interface_abstrato.Abstrato.Poligono;
import interface_abstrato.Abstrato.Quadrado;
import interface_abstrato.Abstrato.Retangulo;
import interface_abstrato.Abstrato.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class aplicacao_poligono {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Poligono resultado;

        resultado = new Triangulo(3,4); // 6
        System.out.println(resultado);

        resultado = new Retangulo(4,3); // 12
        System.out.println(resultado);

        resultado = new Quadrado(6); // 36
        System.out.println(resultado);
    }
}
