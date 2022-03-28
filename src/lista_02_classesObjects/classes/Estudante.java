package lista_02_classesObjects.classes;

import java.util.Scanner;
//Criada Classe private.

public class Estudante {
    public String nome;
    public int idade;
    public String curso;
    public int matricula;

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

    public void mostrarAluno() {System.out.printf("Novo nome: %s \n", this.nome);}
    public void mostrarNovaIdade(){System.out.printf("Nova idade: %d \n", this.idade);}
    public void mostrarNovoCurso() {System.out.printf("Novo curso: %s \n", this.curso);}
    public void mostrarNovaMatricula(){System.out.printf("Nova matricula: %s \n", this.matricula);}
    Scanner in = new Scanner(System.in);
    public void opcao(int escolha){
        if (escolha == 1){
            System.out.println("O campo alterado foi NOME");
            alteraNome();

        }else if(escolha == 2){
            System.out.println("O campo alterado foi IDADE");
            alteraIdade();

        }else if(escolha == 3){
            System.out.println("O campo alterado foi CURSO");
            alteraCurso();

        }else if(escolha == 4){
            System.out.println("O campo alterado foi MATRICULA");
            alteraMatricula();

        }
    }

    //Metodos para guardar guardar o nome antigo e obter o novo.
    public void alteraNome() {
        String nomeAntigo = this.nome;
        System.out.println("Informe um novo nome: ");
        String novoNome = in.nextLine();
        System.out.println("O nome antigo é " + nomeAntigo);
        System.out.println("O novo nome é " + novoNome);

    }
    public void alteraIdade() {
        int idadeAntiga = this.idade;
        System.out.println("Informe uma nova idade: ");
        int novaIdade = in.nextInt();
        System.out.println("A idade antiga é " + idadeAntiga);
        System.out.println("A nova idade é " + novaIdade);

    }
    public void alteraCurso() {
        String cursoAntigo = this.curso;
        System.out.println("Informe um novo curso: ");
        String novoCurso = in.nextLine();
        System.out.println("O antigo curso é " + cursoAntigo);
        System.out.println("O novo curso é " + novoCurso);

    }
    public void alteraMatricula() {
        int antigaMatricula = this.matricula;
        System.out.println("Informe uma nova matricula: ");
        int novaMatricula = in.nextInt();
        System.out.println("A idade antiga é " + antigaMatricula);
        System.out.println("A nova matricula é " + novaMatricula);

    }
}