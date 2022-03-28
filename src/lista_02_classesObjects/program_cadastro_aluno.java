package lista_02_classesObjects;

import lista_02_classesObjects.classes.Estudante;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class program_cadastro_aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        //Vetor atribuindo a quantidade de estudantes cadastrados
        Estudante[] estudantes = new Estudante[3];

        //Definição prévia dos dados cadastrais. Instanciação.
        estudantes[0] = new Estudante("Flavia", 20, "CC", 202020);
        estudantes[1] = new Estudante("José", 25, "ADS", 202022);
        estudantes[2] = new Estudante("Maria", 28, "Direito", 202024);

        //Laço for para ler o nome dos estudantes.
        System.out.println("Lista de estudantes:");
        for (int i = 0; i < estudantes.length; i++) {
            System.out.println(estudantes[i).getNome());
        }

        //Interação com o usuário para obter a informação qual cadastro de aluno sofrerá alteração
        System.out.println("Informe o aluno que deseja alterar o dado: ");
        int escolha = in.nextInt();

        //Criação de uma variável para receber o nome de cada aluno
        String nome = "";
        for (int i = 0; i < estudantes.length; i++) {
            if (escolha == 1) {
                nome = estudantes[0].getNome();
            } else if (escolha == 2) {
                nome = estudantes[1].getNome();
            } else if (escolha == 3) {
                nome = estudantes[2].getNome();
            }
        }
        //Instanciar o nome dos estudantes e mostrar na tela do usuário
        Estudante nomeAluno = new Estudante(nome);
        nomeAluno.mostrarAluno();

        int idade, matricula; String curso;
        for (int i = 0; i < estudantes.length; i++){
            idade = estudantes[i].getIdade();
            curso = estudantes[i].getCurso();
            matricula = estudantes[i].getMatricula();
        }
        //Interação com usuário para definir qual campo será editado.
        System.out.println("Informe o dado cadastral que deverá ser alterado: ");
        System.out.printf("(1) - Nome\n(2) - Idade\n(3) - Curso\n(4) - Matricula\nDigite: ");
        int opcao = in.nextInt();

        nomeAluno.opcao(opcao);

    }
}

