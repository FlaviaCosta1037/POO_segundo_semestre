package lista02_classesObjetos;

import lista02_classesObjetos.entidades.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Estudante[] estudantes = new Estudante[3]; //Chamada do objeto

        //Chamada do construtor
        estudantes[0] = new Estudante("Flavia", 20, "CC", 25021);
        estudantes[1] = new Estudante("Paty", 18, "Odonto", 25022);
        estudantes[2] = new Estudante("Fred", 45, "Medico", 25023);

        //Laço for para ler o nome dos estudantes
        System.out.println("Grupo de alunos");
        System.out.println("----------------");
        for (int i = 0; i < estudantes.length; i++) {
            System.out.printf("\n(%d)" + estudantes[i].nome, i);
            String estudantesNome = estudantes[i].nome;
        }

        //Interação com o usuário..
        System.out.println("\nInforme o numero do um aluno para editar: ");
        int aluno = in.nextInt();

        //Chamada do método escolha o aluno que será editado
        Estudante escolhaAluno = estudantes[aluno];
        escolhaAluno.imprimir();

        //Interação com o usuário de qual atributo será alterado.
        System.out.println("\nInforme qual dado deseja editar: (1, 2, 3, 4)");
        int alterarDado = in.nextInt();
        escolhaAluno.opcao(alterarDado);
        escolhaAluno.imprimir();

    }
}





