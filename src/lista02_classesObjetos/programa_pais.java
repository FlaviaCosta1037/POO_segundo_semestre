package lista02_classesObjetos;

import lista02_classesObjetos.entidades.Estado;
import lista02_classesObjetos.entidades.Pais;

import java.util.Locale;
import java.util.Scanner;

public class programa_pais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o nome do País: ");
        String nomePais = in.nextLine();

        System.out.println("Informe o nome da capital do " + nomePais);
        String capitalpais = in.nextLine();

        String[] cidadesCe = {"Parnamirim", "Caucaia", "Ceará-Mirim", "Fortaleza", "Juazeiro do Norte"},
                 cidadesPe = {"Recife", "Petrolina", "Paulista", "Jaburacão", "Olinda"},
                 cidadesAl = {"Maceió", "Arapiraca", "Palmeira dos Indios", "União dos Palmares", "Rio largo"},
                 cidadesRn = {"Natal", "Mossoró", "Parnamirim", "Ceará Mirim", "Assu"},
                 cidadesPi = {"Teresina", "Parnaíba", "Luiz Correia"};

        String [] nomesEstados = {"Ceará", "Pernambuco","Alagoas", "Rio Grande do Norte","Piauí" };

        Estado[] estados = {
                new Estado(nomesEstados[0], "Fortaleza", cidadesCe,505.404),
                new Estado(nomesEstados[1], "Recife", cidadesPe,400.021),
                new Estado(nomesEstados[2],"Maceió", cidadesAl, 205.453),
                new Estado(nomesEstados[3], "Natal", cidadesRn,208.556),
                new Estado(nomesEstados[4], "Teresina", cidadesPi, 105.456),
        };

        Pais pais = new Pais(nomePais, capitalpais, estados);
        System.out.println(pais);
        System.out.println("Quantidade de cidades: " + pais.obterQuantidadeCidades());
        System.out.println(pais.obterMaiorEstado());

        Pais paisBrasil = new Pais(nomePais, capitalpais, estados);

        //Instanciar um novo país para comparação
        Pais paisEspanha = new Pais("Espanha", "Madrid",estados);

        //Chamada do método para comparação entre os países
        System.out.println(paisBrasil.ehPaisIgual(paisEspanha));
    }

}
