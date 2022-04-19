package lista05.Classes;

public class Eleitor extends Pessoa {
    private int numeroTitulo;
    static int qtdEleitores = 3;

    public Eleitor() {

    }

    public Eleitor(String nome, String cpf, int numeroTitulo) {
        super(nome, cpf);
        this.numeroTitulo = numeroTitulo;
    }

    public int getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(int numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public String toString(){
        String eleitores = "";
        eleitores = super.toString() + String.format("Nome: %s\nCpf: %s\nTitulo: %d\n",getNome(), Utils.formataCpf(getCpf()),this.numeroTitulo);
        return eleitores;

    }

}
