package lista02_classesObjetos.entidades;

import java.util.Locale;
import java.util.Scanner;

public class Estudante {
    Scanner in = new Scanner(System.in);

    //Atributos do objeto Estudante
    public String nome;
    public int idade;
    public String curso;
    public int matricula;


    //Construtor do objeto
    public Estudante(String nome, int idade, String curso, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    //Estrutura de decisão para escolher o aluno que será editado
    public void escolhaAluno(int nomeAluno) {
        if (nomeAluno == 1) {

        } else if (nomeAluno == 2) {

        } else if (nomeAluno == 3) {

        }
    }

    //Estrutura de decisão que decidirá qual atributo será editado
    public void opcao(int escolha) {
        if(escolha == 1){
            escolherNome();
        }else if(escolha == 2){
            escolherIdade();
        }else if(escolha == 3){
            escolherCurso();
        } else if(escolha == 4){
            escolherMatricula();
        }
    }

    //Método para modificar o nome do aluno
    public void escolherNome() {
        System.out.println("Informe outro nome: ");
        String nomeAtual = this.nome;
        this.nome = in.nextLine();
        System.out.println("Nome alterado: " + this.nome);

    }

    //Método para modificar a idade do aluno
    public void escolherIdade() {
        System.out.println("Informe a idade: ");
        int idadeAtual = this.idade;
        this.idade = in.nextInt();
        System.out.println("Idade alterada: " + this.idade);

    }

    //Método para modificar o curso do aluno
    public void escolherCurso() {
        System.out.println("Informe o novo curso: ");
        String cursoAtual = this.curso;
        this.curso = in.nextLine();
        System.out.println("Curso alterado: " + this.curso);

    }
    //Método para modificar a matricula do aluno
    public void escolherMatricula() {
        System.out.println("Informe a nova matricula: ");
        int matriculaAtual = this.matricula;
        this.matricula = in.nextInt();
        System.out.println("Matricula alterada: " + this.matricula);

    }

    public void imprimir() {
        System.out.printf("Nome: %s\nIdade: %d\nCurso: %s\nMatrícula: %d\n-----\n", this.nome, this.idade, this.curso, this.matricula);
    }
}
