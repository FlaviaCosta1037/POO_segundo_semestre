package interface_abstrato.Classes;

public class Multiplicacao implements OperacaoMatematica{

    @Override
    public double calcula(double n1, double n2) {
        return n1 * n2;
    }
}
