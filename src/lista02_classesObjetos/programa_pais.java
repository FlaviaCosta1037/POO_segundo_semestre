package lista02_classesObjetos;

import lista02_classesObjetos.entidades.Pais;

import java.util.Locale;
import java.util.Scanner;

public class programa_pais {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String nomePais = "Brasil";
        String capitalPais = "Brasilia";

        Pais[] estados = new Pais[3];
        String[] nomeEstados = {"Pernambuco", "Alagoas", "Ceará"};

        for (int i = 0; i < estados.length; i++) {
            Pais pais = new Pais(nomePais, capitalPais, nomeEstados[i]);
            estados[i] = new Pais(nomePais, capitalPais, nomeEstados[i]);
        }
        String estado1 = nomeEstados[0];
        String estado2 = nomeEstados[1];
        String estado3 = nomeEstados[2];

        Pais dadosPais1 = new Pais(nomePais, capitalPais, estado1);
        Pais dadosPais2 = new Pais(nomePais, capitalPais, estado2);
        Pais dadosPais3 = new Pais(nomePais, capitalPais, estado3);

        String[] estado1Cidades = {"Recife", "Cabo", "Vitoria", "Paulista"};
        String[] estado2Cidades = {"Maceió", "PalmeiraIndios", "Ribeirao"};
        String[] estado3Cidades = {"Fortaleza", "Caucaia", "Caico"};

        Double dimensaoEstado1 = 305.405;
        Double dimensaoEstado2 = 302.520;
        Double dimensaoEstado3 = 222.505;

        for (int i = 0; i <= 1; i++) {
            int quantidadeCidades = i++;

        }
        Pais.Estado estadoPe1 = new Pais.Estado("Recife", estado1Cidades[0], dimensaoEstado1);
        Pais.Estado estadoPe2 = new Pais.Estado("Recife", estado1Cidades[1], dimensaoEstado1);
        Pais.Estado estadoPe3 = new Pais.Estado("Recife", estado1Cidades[2], dimensaoEstado1);
        Pais.Estado estadoAl1 = new Pais.Estado("Alagoas", estado2Cidades[0], dimensaoEstado2);
        Pais.Estado estadoAl2 = new Pais.Estado("Alagoas", estado2Cidades[1], dimensaoEstado2);
        Pais.Estado estadoAl3 = new Pais.Estado("Alagoas", estado2Cidades[2], dimensaoEstado2);
        Pais.Estado estadoCe1 = new Pais.Estado("Fortaleza", estado3Cidades[0], dimensaoEstado3);
        Pais.Estado estadoCe2 = new Pais.Estado("Fortaleza", estado3Cidades[1], dimensaoEstado3);
        Pais.Estado estadoCe3 = new Pais.Estado("Fortaleza", estado3Cidades[2], dimensaoEstado3);


        dadosPais1.imprimirPais();
        estadoPe1.imprimirCidades();
        estadoPe2.imprimirCidades();
        estadoPe3.imprimirCidades();
        System.out.println("\nDimensão: " + dimensaoEstado1);

        System.out.println("\n=======");

        dadosPais2.imprimirPais();
        estadoAl1.imprimirCidades();
        estadoAl2.imprimirCidades();
        estadoAl3.imprimirCidades();
        System.out.println("\nDimensão: " + dimensaoEstado2);

        System.out.println("\n=======");

        dadosPais3.imprimirPais();
        estadoCe1.imprimirCidades();
        estadoCe2.imprimirCidades();
        estadoCe3.imprimirCidades();
        System.out.println("\nDimensão: " + dimensaoEstado3);

        //Parei aqui. Continuar amanhã.
        estadoPe1.obterQuantidadeCidades();
        estadoPe2.obterQuantidadeCidades();
        estadoPe2.obterQuantidadeCidades();

    }
}