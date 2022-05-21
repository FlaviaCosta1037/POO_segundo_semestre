package lista07;

import lista07.Classes.*;

import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        IBancoGeral conta = new BancoItau();
        int qtd = 0;
        int quantidadeCadastro[] = new int[qtd];

        String nome = "", cpf = "";
        Cliente cliente = new Cliente(nome, cpf);

        System.out.println("==========Abertura de Conta=============\n");
        System.out.println("Informe o nome do cliente: ");
        nome = in.next();
        System.out.println("Informe o CPF: ");
        cpf = in.next();

        cliente = new Cliente(nome, cpf);

        String tipo = "";
        System.out.println("Informe o tipo da conta de abertura:\n1-Conta Corrente\n2-Conta Poupança\nDigite: ");
        tipo = in.next();

        double valorInicial = 0.0;
        System.out.println("Informe o valor inicial da conta: ");
        valorInicial = in.nextDouble();

        String numeroConta = "";
        System.out.println("Informe o numero da conta: ");
        numeroConta = in.next();

        ContaCorrente contaC = new ContaCorrente(numeroConta, valorInicial, cliente);
        Poupanca contaP = new Poupanca(numeroConta, valorInicial, cliente);


        if (tipo == "1") {
            contaC = new ContaCorrente(numeroConta, valorInicial, cliente);
            System.out.println("Tipo de conta: Conta Corrente\n");

        } else if (tipo == "2") {
            contaP = new Poupanca(numeroConta, valorInicial, cliente);
            System.out.println("Tipo de conta: Conta Poupança\n");
        }

        System.out.println(conta.abrirConta(cliente, numeroConta, valorInicial, tipo));
        int escolha = 0;

        System.out.println("==========Operações Disponíveis=============\n");
        System.out.println("1 - Saque\n2- Depósito\n3 - Saír\nEscolha uma opção: ");
        int opcao = in.nextInt();

        System.out.println("Informe o valor: ");
        double valor = in.nextDouble();

        while (opcao == 1) {
            if (tipo.equals("1")) {
                conta.sacar(contaC, valor);
                System.out.println(contaC.obterLimite());
                break;
            } else {
                conta.sacar(contaP, valor);
                System.out.println(contaP.obterLimite());
                break;
            }
        }

        while (opcao == 2) {
            if (tipo.equals("1")) {
                conta.depositar(contaC, valor);
                System.out.println(contaC.obterLimite());
                break;

            } else {
                conta.depositar(contaP, valor);
                System.out.println(contaP.obterLimite());
                break;
            }
        }
    }
}


