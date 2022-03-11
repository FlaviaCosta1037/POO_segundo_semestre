package lista02_classesObjetos.entidades;

public class Pais {
    public String nome;
    public String capital;

    public Pais(String nome, String capital) {
        this.nome = nome;
        this.capital = capital;
    }

    public int obterQuantidadeEstados(){
        int quantidadeA = 0;
        int quantidadeB = 0;
        int resultado = 0;

        String qtdEstados[] = {};
        for(int c = 0; c < qtdEstados.length; c++){
            quantidadeA = c;
            for(int j = 0; j < qtdEstados.length; j++){
                quantidadeB = j;
            }
            resultado = quantidadeA + quantidadeB;
        }
        return resultado;
  }

  public void print(int quantidadeTotal){
      System.out.println(this.obterQuantidadeEstados());
  }

}
