package lista02_classesObjetos.entidades;

public class Estado {
    public String nome;
    public String capital;
    public String cidades[];
    public double dimensao;

    public Estado(String nome, String capital, String cidades[], double dimensao){
        this.nome = nome;
        this.capital = capital;
        this.cidades = cidades;
        this.dimensao = dimensao;
    }

    public void print(){
        System.out.println("Cidade: " + nome + "Capital: " +
                capital + "Cidades: " + cidades + "Dimensoes: " + dimensao);
    }
}
