package exercicios_loiane.Classes;

public class Calculadora {
    private double soma;
    private double subtrai;
    private double multiplica;
    private double divide;

    public Calculadora(double soma, double subtrai, double multiplica, double divide) {
        this.soma = soma;
        this.subtrai = subtrai;
        this.multiplica = multiplica;
        this.divide = divide;
    }

    public static Double somar(Double n1, Double n2){
        return n1 + n2;
    }
    public static Double subtrair(Double n1, Double n2){
        return n1 - n2;
    }
    public static Double dividir(Double n1, Double n2){
        return  n1 / n2;
    }
    public static Double multiplicar(Double n1, Double n2){
        return n1 * n2;
    }

    public static int fatorial(int num){
        int fatorial = 1;
        for(int i = 1; i <= num; i++){
            fatorial = fatorial * i;
        }
        return fatorial;
    }
    public static void imprimir(Double resultado){
        System.out.printf("O resultado é: %.2f", resultado);
    }
}
