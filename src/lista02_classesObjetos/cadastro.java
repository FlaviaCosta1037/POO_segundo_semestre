package lista02_classesObjetos;

import lista02_classesObjetos.entidades.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class cadastro {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
                Scanner in = new Scanner(System.in);

                Estudante estudante = new Estudante();

                System.out.println("Grupo de alunos");
                System.out.println("----------------");

                estudante.cadEstudantes(estudante.nome);

                System.out.println("Informe o nome de um aluno para editar: ");
                String aluno = in.nextLine();


            }
        }


        /*System.out.printf("Alunos:\n========\n");
        for (int i = 0; i < estudante.length; i++) {
            System.out.printf("(%d) %S\n", i + 1, estudante[i].nome);
        }
        System.out.printf("Informe o aluno que será editado: ");
        int selecione = in.nextInt();

        if(selecione == 1){
            System.out.printf(" Nome: %s\n Idade: %d\n Curso: %s\n Matricula: %d\n ",estudante[0].nome, estudante[0].idade,
                    estudante[0].curso, estudante[0].matricula);

        } else if(selecione == 2){
            System.out.printf(" Nome: %s\n Idade: %d\n Curso: %s\n Matricula: %d\n ",estudante[1].nome, estudante[1].idade,
                    estudante[1].curso, estudante[1].matricula);

        }else if(selecione == 3){
            System.out.printf(" Nome: %s\n Idade: %d\n Curso: %s\n Matricula: %d\n ",estudante[2].nome, estudante[2].idade,
                    estudante[2].curso, estudante[2].matricula);

        }*/



