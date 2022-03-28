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
            System.out.println(estudantes[i].getNome());
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

        //Interação com usuário para definir qual campo será editado.
        System.out.println("Informe o dado cadastral que deverá ser alterado: ");
        System.out.printf("(1) - Nome\n(2) - Idade\n(3) - Curso\n(4) - Matricula\nDigite: ");
        int opcao = in.nextInt();

        //Laço de for com repetição para alteração do campo editado e impressão dos dados.
        for (int i = 0; i < escolha; i++){
            if(opcao == 1){
                nomeAluno.alteraNome();
                System.out.println("O campo alterado foi NOME");
                System.out.println("Nome antigo: " + estudantes[i].getNome());
                nomeAluno.mostrarAluno();
            }else if(opcao == 2){
                nomeAluno.alteraIdade();
                System.out.println("O campo alterado foi IDADE");
                System.out.println("Idade antiga: " + estudantes[i].getIdade());
                nomeAluno.mostrarNovaIdade();
            }else if(opcao ==3){
                nomeAluno.alteraCurso();
                System.out.println("O campo alterado foi CURSO");
                System.out.println("Curso antigo: " + estudantes[i].getCurso());
                nomeAluno.mostrarNovoCurso();
            }else if(opcao == 4){
                nomeAluno.alteraMatricula();
                System.out.println("O campo alterado foi MATRICULA");
                System.out.println("Matricula antiga: " + estudantes[i].getMatricula());
                nomeAluno.mostrarNovaMatricula();

            }

        }
    }
}

