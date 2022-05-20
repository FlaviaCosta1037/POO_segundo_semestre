package lista07.Classes;

public class BancoItau implements IBancoGeral {

    @Override
    public ContaAbstrata abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {
        ContaAbstrata conta = null;
        ContaAbstrata contaC = new ContaCorrente();
        contaC.getCliente();
        ContaAbstrata contaP = new Poupanca();
        contaP.getCliente();

        if (conta == contaC){
            tipo = "Conta Corrente!";
            conta = contaC;
            return conta;
        } else {
            tipo = "Conta poupança!";
            conta = contaP;
            return conta;
        }
    }

    @Override
    public boolean depositar(ContaAbstrata c, double valor) {
        return this.depositar(c,valor);
    }

    @Override
    public boolean sacar(ContaAbstrata c, double valor) {
        return this.sacar(c, valor);
    }

}


