package lista07;

import lista07.Classes.BancoItau;
import lista07.Classes.Cliente;
import lista07.Classes.IBancoGeral;

public class teste {
    public static void main(String[] args) {
        IBancoGeral conta = new BancoItau();
        Cliente cliente1 = new Cliente("Flavia","01358403414");

        //System.out.println(conta.abrirConta(cliente1,"123456",100.00,"CC"));

    }
}
