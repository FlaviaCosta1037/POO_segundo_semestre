package lista02_classesObjetos.entidades;

public class Estudante {
    public String nome[] = {"Flavia", "Maria", "José"};
    public String idade[] = {"35", "40", "20"};
    public String curso[] = {"Tec.Inf", "Direito", "Arquitetura"};
    public String matricula[] = {"154", "355", "444"};

    public void cadastroAlunos(String nome[]) {
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }
    }

    public void editarAlunos() {

    }
}