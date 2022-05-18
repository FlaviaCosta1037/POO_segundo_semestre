package lista7.Classes;

public class Poupanca extends ContaAbstrata{
    public double saldo;
    @Override
    public double obterLimite() {
        return getSaldo();
    }

}
