package lista07.Classes;

public class BancoItau implements IBancoGeral {

    @Override
    public ContaAbstrata abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {

        if(tipo.equals("corrente")) {
            return new ContaCorrente(numeroConta,saldoInicial,c);
        }else {
            return new Poupanca(numeroConta,saldoInicial,c);
        }

    }
    @Override
    public boolean depositar(ContaAbstrata c, double valor) {
        c.depositar(valor);
        return true;
    }

    @Override
    public boolean sacar(ContaAbstrata c, double valor) {
        if (c.obterLimite() < valor){
            System.out.println("Saldo indisponível na conta!\nO saldo atual é R$ " + c.getSaldo());
        }
            c.sacar(valor);
        return true;
    }
}


