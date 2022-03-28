package lista_02_classesObjects.classes;

import java.util.Scanner;
//Criada Classe private.
public class Estudante {
    Scanner in = new Scanner(System.in);
    private String nome;
    private int idade;
    private String curso;
    private int matricula;

    //Chamada dos metodos getters and setters.
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

    //Criado construtor de nome para auxilar na instanciação na main.
    public Estudante(String nome) {
        this.nome = nome;
    }

    //Construtor geral
    public Estudante(String nome, int idade, String curso, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    //Metodos para imprimir os dados individuais do estudante.
    public void mostrarAluno() {
        System.out.printf("Nome alterado: %s \n", this.nome);
    }
    public void mostrarNovaIdade(){
        System.out.printf("Nova idade: %d \n", this.idade);
    }
    public void mostrarNovoCurso() {
        System.out.printf("Novo curso: %s \n", this.curso);
    }
    public void mostrarNovaMatricula(){
        System.out.printf("Nova matricula: %s \n", this.matricula);
    }

    //Metodo para imprimir todos os dados caso necessário.
    public void mostraDadosAluno() {
        System.out.printf("Nome: %s \nIdade:%d anos\n Curso:%s \n Matricula: %d\n", this.nome, this.idade, this.curso, this.matricula);
    }

    //Metodos para guardar guardar o nome antigo e obter o novo.
    public void alteraNome() {
        String nomeAntigo = this.nome;
        String novoNome;
        System.out.println("Informe um novo nome: ");
        novoNome = in.nextLine();
        this.nome = novoNome;
    }

    public void alteraIdade() {
        int idadeAntiga = this.idade;
        int novaIdade;
        System.out.println("Informe uma nova idade: ");
        novaIdade = in.nextInt();
        this.idade = novaIdade;
    }

    public void alteraCurso() {
        String cursoAntigo = this.curso;
        String novoCurso;
        System.out.println("Informe um novo curso: ");
        novoCurso = in.nextLine();
        this.curso = novoCurso;

    }
    public void alteraMatricula() {
        int matriculaAntiga = this.matricula;
        int novaMatricula;
        System.out.println("Informe uma nova matricula: ");
        novaMatricula = in.nextInt();
        this.matricula = novaMatricula;
    }
}