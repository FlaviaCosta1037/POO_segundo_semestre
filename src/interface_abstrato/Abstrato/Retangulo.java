package interface_abstrato.Abstrato;

public class Retangulo extends Poligono {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return this.base * this.altura; // 12
    }
    @Override
    public String toString() {
        return "Resultado: " + this.calcArea();
    }
}
