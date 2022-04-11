package lista_02_classesObjects.classes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Estudante {
    Scanner in = new Scanner(System.in);
    private String nome;
    private String curso;
    private int idade;
    private int matricula;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, String curso, int idade, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void selecioneAluno(int opcao){
        if(opcao == 1){

        }else if(opcao == 2){

        }else if(opcao == 3){

        }
    }
    public void alterarCadastro(int opcao){
        if(opcao == 1){
            System.out.printf("Campo selecionado (Alterar Nome) ");
            alterarNome();
        }else if(opcao == 2){
            System.out.printf("Campo selecionado (Alterar Curso)");
            alterarCurso();
        }else if(opcao == 3){
            System.out.printf("Campo selecionado (Alterar Idade)");
            alterarIdade();
        }else if(opcao == 4){
            System.out.printf("Campo selecionado (Alterar Matricula)...");
            alterarMatricula();
        }
    }

    public void alterarNome(){
        System.out.printf("Informe o novo nome: ");
        String novoDado = in.nextLine();
        String dadoAntigo = this.nome;
        System.out.printf("=>Alterar Nome<=\n");
        System.out.printf("Nome antigo: %s\nNovo nome: %s ", dadoAntigo, novoDado);

    }
    public void alterarCurso(){
        System.out.printf("Informe o novo curso: ");
        String novoDado = in.nextLine();
        String dadoAntigo = this.curso;
        System.out.printf("=>Alterar Curso<=\n");
        System.out.printf("Curso antigo: %s\nNovo curso: %s ", dadoAntigo, novoDado);

    }
    public void alterarIdade(){
        System.out.printf("Informe o nova Idade: ");
        int novoDado = in.nextInt();
        int dadoAntigo = this.idade;
        System.out.printf("=>Alterar Idade<=\n");
        System.out.printf("Idade antiga: %d\nNova idade: %d ", dadoAntigo, novoDado);

    }
    public void alterarMatricula(){
        System.out.printf("Informe o nova matricula: ");
        int novoDado = in.nextInt();
        int dadoAntigo = this.matricula;
        System.out.printf("=>Alterar Matricula<=\n");
        System.out.printf("Matricula antiga: %d\nNova matricula: %d ", dadoAntigo, novoDado);

    }

    @Override
    public String toString() {
        return  "Nome: " + nome + '\'' +
                "\nCurso: " + curso + '\'' +
                "\nIdade: " + idade +
                "\nMatricula: " + matricula;
    }
}