package lista_revisao.primeiro_periodo;

import java.util.Locale;
import java.util.Scanner;

//Construa um método capaz de calcular a exponenciação para qualquer
// base e expoentes de um número inteiro positivo sem usar o método pow da classe Math do Java.

public class exe02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int base, exp;
        System.out.println("Informe a base e o expoente respectivamente: ");
        base = in.nextInt();
        exp = in.nextInt();

        int resultadoExp = exponenciacao(base, exp);

        mostrarResultado(resultadoExp);
    }

    public static int exponenciacao(int x, int y) {
        int resultado = 1;
        int expoente = y;

        for (int i = 0; i < expoente; i++) {
            resultado *= x;

        }
        return resultado;
    }

    public static void mostrarResultado(int valor) {
        System.out.println(valor);
    }
}
