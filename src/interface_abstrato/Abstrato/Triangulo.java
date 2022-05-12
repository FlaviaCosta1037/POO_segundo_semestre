package interface_abstrato.Abstrato;

public class Triangulo extends Poligono{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public String toString() {
        return "Resultado: " + this.calcArea();
    }
}
