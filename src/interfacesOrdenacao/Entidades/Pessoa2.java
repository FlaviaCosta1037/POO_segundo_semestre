package interfacesOrdenacao.Entidades;

public class Pessoa2 implements Comparable<Pessoa2> {
    private String nome;
    private String sobrenome;


    public Pessoa2(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Método para comparar o nome e o sobrenome
    @Override
    public int compareTo(Pessoa2 nome) {
        int name =  this.getNome().compareToIgnoreCase(nome.getNome());
        int afterName = this.getSobrenome().compareToIgnoreCase(nome.getSobrenome());

        if(name != 0) return name;
        if(afterName != 0) return afterName;

        return this.getNome().compareToIgnoreCase(this.getSobrenome());
    }
}
