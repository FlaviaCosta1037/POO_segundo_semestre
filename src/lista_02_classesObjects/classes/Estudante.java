package lista_02_classesObjects.classes;

import java.util.Scanner;

public class Estudante {
    Scanner in = new Scanner(System.in);
    private String nome;
    private int idade;
    private String curso;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, int idade, String curso, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String escolhaAluno() {
        String escolha = "";
        String nome;
        int idade;
        int matricula;
        String curso;

        if (escolha == this.nome) {
            nome = this.nome;
            idade = this.idade;
            matricula = this.matricula;
            curso = this.curso;


        } else if (escolha == this.nome) {
            nome = this.nome;
            idade = this.idade;
            matricula = this.matricula;
            curso = this.curso;
        } else {
            nome = this.nome;
            idade = this.idade;
            matricula = this.matricula;
            curso = this.curso;
        }

        return nome;
    }
    public void mostraDadosAluno() {
        System.out.printf("Nome: %s \nIdade:%d anos\n Curso:%s \n Matricula: %d\n", this.nome, this.idade, this.curso, this.matricula);

    }
    public void alterarNome() {
        String nomeAntigo = this.nome;
        System.out.printf("Informe outro nome: ");
        this.nome = in.nextLine();
        System.out.println("Novo nome: " + this.nome);

    }
    public void alterarIdade() {
        int idadeAntiga = this.idade;
        System.out.printf("Informe outra idade: ");
        this.idade = in.nextInt();
        System.out.println("Nova Idade: " + this.idade);

    }
    public void alterarCurso() {
        String cursoAntigo = this.curso;
        System.out.printf("Informe o novo curso: ");
        this.curso = in.nextLine();
        System.out.println("Novo curso: " + this.curso);

    }
    public void alteraMatricula() {
        int matriculaAntiga = this.matricula;
        System.out.printf("Informe a nova matricula: ");
        this.matricula = in.nextInt();
        System.out.println("Nova matricula: " + this.matricula);

    }
    public void dadosAlterados(int opte){
        int opcao = 0;
        switch (opcao){
            case 1:
                alterarNome();
            case 2:
                alterarIdade();
            case 3:
                alterarCurso();
            case 4:
                alteraMatricula();
        }
    }

}

