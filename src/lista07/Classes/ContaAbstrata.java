package lista07.Classes;

public abstract class ContaAbstrata {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public ContaAbstrata(String numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    abstract double obterLimite();

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
        return "==========Cliente===========" + getCliente() + "\n\n==========Conta=========== \nNúmero: \n" + getNumeroConta() + "\n==========Saldo=========== \nR$ " + getSaldo();
    }
}
