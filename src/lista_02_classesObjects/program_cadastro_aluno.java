package lista_02_classesObjects;

import lista_02_classesObjects.classes.Estudante;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class program_cadastro_aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Estudante[] estudantes = new Estudante[3];

        estudantes[0] = new Estudante("Flavia", 20, "CC", 202020);
        estudantes[1] = new Estudante("Paty", 25, "ADS", 202022);
        estudantes[2] = new Estudante("Roberto", 28, "Direito", 202024);

        System.out.println("====Lista dos estudantes====");
        for (int i = 0; i < estudantes.length; i++) {
            System.out.printf("%s\n", estudantes[i].getNome());
        }
        System.out.println("Informe o nome do estudante que será alterado: ");
        String escolha = in.next();

        Estudante alunoEscolhido = new Estudante(escolha);

        System.out.printf("Informe a opção que deverá ser alterada: 1 - Nome, 2 - idade, 3 - curso, 4 - matricula\n");
        int opcao = in.nextInt();

        Estudante escolhaAluno = estudantes[opcao];
        escolhaAluno.mostraDadosAluno();

        System.out.printf("Informe o novo valor que deseja substituir: ");
        int editarDado = in.nextInt();
        escolhaAluno.dadosAlterados(editarDado);
        escolhaAluno.mostraDadosAluno();





        /*if (escolha == estudante1.getNome()) {
            estudante1.mostraDadosAluno();
        } else if (escolha == estudante2.getNome()) {
            estudante2.mostraDadosAluno();
        } else if (escolha == estudante3.getNome()) {
            estudante3.mostraDadosAluno();
        }*/


    }
}

