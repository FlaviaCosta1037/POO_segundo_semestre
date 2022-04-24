package revisao_prova.Classes;
//Classe com métodos staticos.

public class Calculadora {
    private double soma;
    private double subtracao;
    private double multiplicacao;
    private double divisao;

    Calculadora(double soma, double subtracao, double multiplicacao, double divisao) {
        this.soma = soma;
        this.subtracao = subtracao;
        this.multiplicacao = multiplicacao;
        this.divisao = divisao;
    }
    Calculadora(){

    }
     public static double somar(double n1, double n2){
        return n1 + n2;
     }
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }
    public static double multiplicar (double n1, double n2){
        return n1 * n2;
    }
    public static double dividir (double n1, double n2){
        return n1 / n2;
    }
}
