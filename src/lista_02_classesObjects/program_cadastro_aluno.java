package lista_02_classesObjects;

import lista_02_classesObjects.classes.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class program_cadastro_aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Estudante[] estudante = new Estudante[3];
        estudante[0] = new Estudante("Renato","ADS",25,2003);
        estudante[1] = new Estudante("Paty","ADS",29,2004);
        estudante[2] = new Estudante("Flavia","CC",26,2005);

        System.out.printf("Alunos Matriculados\n");
        for(int i = 0; i< estudante.length; i++){
            System.out.println(i + 1 + "-" + estudante[i].getNome());
        }

        System.out.printf("Informe qual aluno sofrerá alteração: ");
        int selecioneAluno = in.nextInt();
        Estudante alunoSelecionado = estudante[selecioneAluno - 1];
        System.out.println(alunoSelecionado);

        System.out.printf("Informe qual campo deseja alterar:\n1 - Nome \n2 - Curso \n3 - Idade \n4 - Matricula\n Digite:  ");
        int opcao = in.nextInt();

        alunoSelecionado.alterarCadastro(opcao);

    }
}

