package lista07.Classes;

public class ContaCorrente extends ContaAbstrata{
    private double limiteChequeEsp;

    public ContaCorrente(String numeroConta, double saldo, Cliente cliente) {
        super(numeroConta, saldo, cliente);
        this.limiteChequeEsp = 1000;
    }

    @Override
    public double obterLimite() {
        return limiteChequeEsp + getSaldo();
    }
}
