package revisao_prova.Classes;

public class Ingresso {
    private Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }
    public Double obterValor(double valor){
        return valor = this.valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + valor +
                '}';
    }
}
