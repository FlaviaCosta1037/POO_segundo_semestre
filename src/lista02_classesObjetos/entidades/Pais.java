package lista02_classesObjetos.entidades;

public class Pais {
    public String nome;
    public String capital;
    public int [] estado;
    public int [] cidades;
    public double dimensao;

    public Pais(String nome, String capital, int [] estado, int [] cidades, double dimensao){
        this.nome = nome;
        this.capital = capital;
        this.estado = new int[estado.length];
        this.cidades = new int[cidades.length];
        this.dimensao = dimensao;
    }

    public int obterQuantidadeCidades(int qtdcidades[]){
        qtdcidades = new int[cidades.length];
        int qtd = 0;
        for(int i = 0; i < qtdcidades.length; i++){
            qtd = qtdcidades[i];
        }
        return qtd;
    }
    /*public String obterMaiorEstado(int estado[]){
        estado = new int[estado.length];
        for(int i = 0; i < estado.length; i++){

        }
    }*/

}
