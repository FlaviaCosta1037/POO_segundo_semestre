package lista_02_classesObjects;

import lista_02_classesObjects.classes.Estudante;

import javax.sound.midi.Soundbank;
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
            System.out.printf("%d - %s\n", i + 1, estudante);
        }
        System.out.println("Informe o nome do estudante que será alterado: ");
        String escolha = in.next();

        Estudante estudante1 = new Estudante(escolha, 20, "CC", 202020);
        Estudante estudante2 = new Estudante(escolha, 25, "ADS", 202022);
        Estudante estudante3 = new Estudante(escolha, 28, "Direito", 202024);

        Estudante estudanteEscolhido = new Estudante(escolha);
        estudanteEscolhido.escolhaAluno();

        System.out.println("Informe o dado cadastral que deverá ser alterado: ");
        System.out.printf("(1) - Nome\n(2) - Idade\n(3) - Curso\n(4) - Matricula\nDigite: ");
        int opcao = in.nextInt();

        Estudante escolhaOpcao = new Estudante(escolha);
        escolhaOpcao.alteraDado();

        System.out.println("Informe um novo valor para este campo: ");
        //escolhaOpcao = in.nextInt()

        if (escolha == estudante1.getNome()) {
            estudante1.mostraDadosAluno();
        } else if (escolha == estudante2.getNome()) {
            estudante2.mostraDadosAluno();
        } else if (escolha == estudante3.getNome()) {
            estudante3.mostraDadosAluno();
        }




    }
}

