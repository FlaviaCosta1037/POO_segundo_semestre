package lista7.Classes;

public class ContaCorrente extends ContaAbstrata{
    private double limiteChequeEsp = 1000;

    public ContaCorrente() {
        this.limiteChequeEsp = limiteChequeEsp;
    }

    @Override
    public double obterLimite() {
        return getSaldo() + limiteChequeEsp;
    }
}
