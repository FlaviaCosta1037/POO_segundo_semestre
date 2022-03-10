package lista02_classesObjetos.entidades;

import java.util.Scanner;

public class Estudante {
    Scanner in = new Scanner(System.in);

    public String nome[] = {"Flávia","Roberto","Francisco"};
    public int idade[] = {20, 50, 40};
    public String curso[] = {"Ciencias da Computação", "Biologia", "Direito"};
    public int matricula[] = {2020141, 303052, 408256};


    public void cadEstudantes(String cadastro[]){
        for (int i = 0; i < nome.length; i++){
            String nomeA = nome[i];
            int idadeA = idade[i];
            String cursoA = curso[i];
            int matriculaA = matricula[i];

            System.out.printf("\nNome:%s\n Idade:%d\n Curso:%s\n Matricula:%s\n",nomeA ,idadeA ,cursoA ,matriculaA);

        }
    }
    /*public void opcao(char escolha){
        switch (escolha){
            case 1:
                escolherNome();
                break;
            case 2:
                escolherIdade();
                break;
            case 3:
                escolherCurso();
            case 4:
                escolherMatricula();
                break;
        }
    }

    public void escolherNome() {
        System.out.println("Informe outro nome: ");
        String nomeAtual = this.nome;
        this.nome = in.nextLine();
        System.out.println("Nome alterado: " + this.nome);

    }

    public void escolherIdade() {
        System.out.println("Informe a idade: ");
        int idadeAtual = this.idade;
        this.idade = in.nextInt();
        System.out.println("Nome alterado: " + this.idade);

    }

    public void escolherCurso() {
        System.out.println("Informe o novo curso: ");
        String cursoAtual = this.curso;
        this.curso = in.nextLine();
        System.out.println("Nome alterado: " + this.curso);

    }

    public void escolherMatricula() {
        System.out.println("Informe a nova matricula: ");
        int matriculaAtual = this.matricula;
        this.matricula = in.nextInt();
        System.out.println("Nome alterado: " + this.matricula);

    }

    public void imprimir() {
        System.out.printf("Nome: %s\nIdade: %d\nCurso: %s\nMatrícula: %d\n-----\n", this.nome, this.idade, this.curso, this.matricula);
    }*/
}