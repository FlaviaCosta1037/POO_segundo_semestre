package lista04_objetos.Classes;

public class Contato {
    public String nome;
    public int idade;
    public String sexo;
    public int foneCel;
    public String eMail;

    public Contato(String nome, int idade, String sexo, int foneCel, String eMail) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.foneCel = foneCel;
        this.eMail = eMail;
    }
    public Contato(String nome){
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Contato: " +
                "Nome: " + nome + '\'' +
                "Idade: " + idade +
                "Sexo: " + sexo + '\'' +
                "FoneCel: " + foneCel +
                "Email='" + eMail + '\'' +
                '}';
    }
}
