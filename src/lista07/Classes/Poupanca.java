package lista07.Classes;

public class Poupanca extends ContaAbstrata{
    public double saldo;

    public Poupanca(String numeroConta, double saldo, Cliente cliente) {
        super(numeroConta, saldo, cliente);
        this.saldo = saldo;
    }

    @Override
    public double obterLimite() {
        return getSaldo();
    }

}
