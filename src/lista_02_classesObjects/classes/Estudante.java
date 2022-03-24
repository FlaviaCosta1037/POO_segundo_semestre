package lista_02_classesObjects.classes;

public class Estudante {
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

    public String escolhaAluno(){
        String escolha = "";
        String aluno;

        if(escolha == this.nome){
            aluno = this.nome;
        }else if(escolha == this.nome){
            aluno = this.nome;
        }else{
            aluno = this.nome;
        }
        System.out.printf("Nome: %s\n Idade: %d\n Curso: %s\n Matricula: %d ", aluno, this.idade, this.curso, this.matricula);

        return aluno;
    }

    public void mostraDadosAluno(){

    }

    /*public String alteraAluno(){
        String alunoAntigo = escolhaAluno();

    }*/
}
