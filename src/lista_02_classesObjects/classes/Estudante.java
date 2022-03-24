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
    public void alteraDado() {
        int opcao = 0;

        switch (opcao){
            case 1:
                nome = this.nome;
                break;
            case 2:
                idade = this.idade;
                break;
            case 3:
                curso = this.curso;
                break;
            case 4:
                matricula = this.matricula;
                break;
        }
    }

}

