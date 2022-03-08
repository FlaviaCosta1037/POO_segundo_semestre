package lista02_classesObjetos;

import lista02_classesObjetos.entidades.Estudante;
import java.util.Locale;
import java.util.Scanner;

public class cadastro {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Estudante estudante = new Estudante();
        Scanner in = new Scanner(System.in);

        String cadastroAlunos[] = new String[3];
        for(int i = 0; i < cadastroAlunos.length; i++){
        }
        System.out.println("Grupo de alunos");
        System.out.println("----------------");
        estudante.cadastroAlunos(estudante.nome);

        System.out.println("Informe o nome de um aluno para editar: ");
        String aluno = in.nextLine();

        estudante.editarAlunos();

    }
}
