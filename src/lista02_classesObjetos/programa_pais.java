package lista02_classesObjetos;

import lista02_classesObjetos.entidades.Estado;
import lista02_classesObjetos.entidades.Pais;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class programa_pais {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        String cidadesPe[] = {"Cabo", "Jaboatão", "Paulista", "Pesqueira"};
        String cidadesCe[] = {"Caucaia", "Mossoró", "Juazeiro do Norte"};

        Estado estado[] = new Estado[]{new Estado("Pernambuco", "Recife", cidadesPe, 505.535),
                new Estado("Ceará", "Fortaleza", cidadesCe, 405.625)};

        Pais pais = new Pais("Brasil", "Brasilia");

        int quantidadeTotal = 0;
        for (int i = 0; i < cidadesPe.length; i++) {
            for (int j = 0; j < cidadesCe.length; j++) {
            }
        }
        quantidadeTotal = cidadesCe.length + cidadesPe.length;
        pais.print(quantidadeTotal);
    }
}
