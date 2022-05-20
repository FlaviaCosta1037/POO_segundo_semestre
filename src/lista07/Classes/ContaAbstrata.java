package lista07.Classes;

public abstract class ContaAbstrata {
    private String numeroConta;
    private double saldo = 0.0;
    private Cliente cliente;

    abstract double obterLimite();

    public ContaAbstrata() {
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double depositar(double valor){
        return this.saldo += valor;
    }

    public double sacar(double valor){
        return this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaAbstrata{" +
                "numeroConta='" + getNumeroConta()+ '\'' +
                ", saldo=" + getSaldo() +
                ", cliente=" + getCliente() +
                '}';
    }
}
