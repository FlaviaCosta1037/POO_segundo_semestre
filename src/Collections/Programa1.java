package Collections;

import Collections.Entidades.Dependente;
import Collections.Entidades.Empresa;
import Collections.Entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        try {
            List<Empresa> cadastroGeral = new ArrayList<>();
            List<String> cadGeral = new ArrayList<>();

            Empresa empresa = new Empresa();

            System.out.println("Quantidade de funcionários: ");
            int qtd = in.nextInt();
            String nomeF = "", nomeD = "";
            Integer idade = 0;
            int qtdDependente = 0;

            Funcionario funcionario = new Funcionario(nomeF);
            Dependente dependente = new Dependente(nomeD, idade);

            for (int i = 1; i <= qtd; i++) {
                System.out.println("Funcionário: " + i);
                nomeF = in.next();
                funcionario = new Funcionario(nomeF);

                System.out.println("Quantos dependentes? ");
                qtdDependente = in.nextInt();

                for (int j = 1; j <= qtdDependente; j++) {
                    if (qtdDependente == 0) {
                        System.out.println("Funcionário não possue dependente! ");
                    } else {
                        System.out.println("Dependente: ");
                        nomeD = in.next();
                        System.out.println("Idade Dependente: ");
                        idade = in.nextInt();
                        dependente = new Dependente(nomeD, idade);
                    }
                }
                empresa.realizarCadastro(funcionario);
                funcionario.addDependente(dependente);
                cadGeral.add(funcionario.quantidadeDependente(nomeF, qtdDependente));
            }
            for (String cadastro : cadGeral) {
                System.out.println(cadastro);
            }
            dependente.dependenteMaisVelho(idade);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro no vetor!");
        }
    }
}