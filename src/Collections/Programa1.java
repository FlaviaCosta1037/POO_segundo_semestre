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

        List<Funcionario> cadastroFuncionario = new ArrayList<>();
        List<Dependente> listaDependentes = new ArrayList<>();

        Funcionario funcionario = new Funcionario("Roberto");
        cadastroFuncionario.add(funcionario);
        Dependente dependente = new Dependente("Beatriz", 2);
        listaDependentes.add(dependente);

        funcionario = new Funcionario("Rafaela");
        cadastroFuncionario.add(funcionario);
        dependente = new Dependente("Olivia", 6);
        listaDependentes.add(dependente);

        funcionario = new Funcionario("Reinaldo");
        cadastroFuncionario.add(funcionario);
        dependente = new Dependente("Duda", 9);
        listaDependentes.add(dependente);

        Empresa empresa = new Empresa();

        for (Funcionario listaF : cadastroFuncionario) {
            empresa.realizarCadastro(listaF);
            for (Dependente listaD : listaDependentes) {
                funcionario.addDependente(listaD);
            }

            System.out.println(listaF);
        }
        System.out.println(listaDependentes);

        //Ajustar codigo

    }
}
