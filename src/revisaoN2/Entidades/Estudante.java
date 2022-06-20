package revisaoN2.Entidades;

import java.util.LinkedList;

public class Estudante {
    private String nome;
    private int idade;
    private String curso;
    private int matricula;

    public Estudante(){

    }
    public Estudante(String nome){
        this.nome = nome;
    }
    public Estudante(String nome, int idade, String curso, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

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

    public void editarAluno(String escolha){

    }
    public void listarAlunos(Estudante estudante){
        LinkedList<Estudante> listarAlunos = new LinkedList<>();
        listarAlunos.add(estudante);
        String listaDeAlunos = "";
        for(Estudante alunos : listarAlunos){
            listaDeAlunos = alunos.getNome();
        }
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", curso='" + curso + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
