package revisaoN2;

import revisaoN2.Entidades.Estudante;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class mainCadastroEstudante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String nome = "", curso = "";
        int idade = 0, matricula = 0, opcao = 0, i = 0;

        LinkedList<Estudante> lista = new LinkedList<>();
        Estudante estudante = new Estudante();

        try {
            System.out.println("Informe a quantidade de alunos que deseja cadastrar: ");
            opcao = in.nextInt();

            for (i = 1; i <= opcao; i++) {
                System.out.println("Informe o nome: ");
                nome = in.next();

                System.out.println("Informe o curso: ");
                curso = in.next();

                System.out.println("Informe a idade: ");
                idade = in.nextInt();

                System.out.println("Informe a matricula: ");
                matricula = in.nextInt();

                estudante = new Estudante(nome, idade, curso, matricula);
                lista.add(estudante);
            }
            System.out.println("==========Alunos==========");
            for (Estudante alunos : lista) {
                System.out.println(alunos.getNome());
            }
            System.out.println("Informe o aluno que deseja editar: ");
            String escolha = in.next();

            System.out.println("=======Alunos========");
            estudante.listarAlunos(estudante);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro de indice no array! ");
        } catch (InputMismatchException c) {
            System.out.println("Valor inválido! ");
        }
    }
}
