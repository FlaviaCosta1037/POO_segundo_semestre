package revisao_prova.Classes;

public class Vip extends Ingresso{
    private double valorAdicional;


    public Vip(Double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public double obterValor(double valor, double valorAdicional){
        valorAdicional = this.valorAdicional;
        valor += valorAdicional;
        return valor;
    }
}
