package interface_abstrato.Abstrato;

public class Quadrado extends Poligono {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return Math.pow(this.lado,2);
    }
    @Override
    public String toString() {
        return "Resultado: " + this.calcArea();
    }
}
