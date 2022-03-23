package lista_02_classesObjects;

import lista_02_classesObjects.classes.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class program_cadastro_aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String[] nomes = {"Flavia", "Rodrigo", "José"};
        Estudante[] estudantes = new Estudante[nomes.length];

        System.out.println("====Lista dos estudantes====");
        for (int i = 0; i < estudantes.length; i++) {
            String estudante = nomes[i];
            System.out.printf("%d - %s\n", i+1, estudante);
        }
        System.out.println("Informe o numero do estudante que será alterado: ");
        String escolha = in.next();

        Estudante estudante = new Estudante(escolha);
        estudante.escolhaAluno();
    }
}
