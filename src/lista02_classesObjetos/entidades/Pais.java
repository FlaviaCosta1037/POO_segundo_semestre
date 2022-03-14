package lista02_classesObjetos.entidades;

public class Pais {
    public String nomePais;
    public String capital;
    public String estados;

    public Pais(String nomePais, String capital, String estados) {
        this.nomePais = nomePais;
        this.capital = capital;
        this.estados = estados;
    }

    public static class Estado {
        public String capitalEstado;
        public String cidades;
        public Double dimensao;

        public Estado (String capitalEstado, String cidades, Double dimensao) {
            this.capitalEstado = capitalEstado;
            this.cidades = cidades;
            this.dimensao = dimensao;
        }

        public void imprimirCidades(){
            System.out.printf("%s ", this.cidades);
        }

        public void imprimirDimensoes(){
            System.out.printf("Dimensão %f ", this.dimensao);
        }

        public int obterQuantidadeCidades(){
            return  cidades.length();
        }

        public void imprimirQtdCidades(){
            System.out.println(obterQuantidadeCidades());
        }


    }
    public void imprimirPais(){
        System.out.println("Dados do País\nNome: " + this.nomePais + "\nCapital do país: " + this.capital + "\nEstado: " + this.estados);
    }
}
