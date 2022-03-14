package lista02_classesObjetos.entidades;

//Criada Classe País
public class Pais {
    public String nomePais;
    public String capital;
    public Estado[] estados;

    //Criado construtor da Classe país
    public Pais(String nomePais, String capital, Estado[] estados) {
        this.nomePais = nomePais;
        this.capital = capital;
        this.estados = estados;
    }

    //Método para obter a quantidade de cidades dos estados.

    public int obterQuantidadeCidades() {

        int qtdCity = 0; //Variavel de inicialização para contagem das cidades.
            for (Estado estados : this.estados) { //Laço for puxando o estado e Tipo estado da Classe estado.
            qtdCity += estados.qtdCidades();
        }
        return qtdCity;
    }

    //Criado método do tipo Estado para obter o maior estado.
    public Estado obterMaiorEstado() {
        Estado maiorEstado = this.estados[0]; //Instanciar variável do tipo estado da Classe Estado utilizando o primeiro vetor.
        for (Estado estado : this.estados) { //Laço foreach para percorrer o vetor estado do tipo Estado da Classe.
            if (maiorEstado.dimensao < estado.dimensao) { //Confirmação da maior dimensão baseada no maiorEstado.dimensao.
                maiorEstado = estado; //O maior estado recebe a variável estado da Classe estado.
            }
        }
        return maiorEstado;
    }
}
