package interface_abstrato.Classes;

public class Divisao implements OperacaoMatematica{

    @Override
    public double calcula(double n1, double n2) {
        return n1 / n2 ;
    }
}
