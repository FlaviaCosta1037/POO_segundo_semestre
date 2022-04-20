package lista05;

import lista05.Classes.Candidato;
import lista05.Classes.Eleitor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class sistemaEleitoral {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Candidato candidato[] = new Candidato[2];
        candidato[0] = new Candidato("Peuzin da sacola","12345678945", "Partido do Povo", 13);
        candidato[1] = new Candidato("Rita Desgramada","96325874123", "Partido da Cerveja gelada", 20);

        System.out.println("=====Sistema de votação=====");
        System.out.println("========Candidatos==========\n");
        candidato[0].imprimir();
        candidato[1].imprimir();

        Eleitor eleitores[] = new Eleitor[3];

        String nomeEleitor, numeroCpf;
        Candidato vencedor;
        int numeroTitulo = 0, tituloanterior = 0, numeroCandidato;



        System.out.println("====Sistema de Cadastro de Eleitor====");
        for (int i = 0; i < eleitores.length; i++) {
            System.out.println("Informe seu nome: ");
            nomeEleitor = in.next();

            System.out.println("Informe seu CPF: ");
            numeroCpf = in.next();

            System.out.println("Informe o numero do titulo: ");
            numeroTitulo = in.nextInt();

            //Se numeroTitulo for = ao titulo anterior e diferente de zero, contador -- para repetir a pergunta
            //Caso contrario aceita e segue o contador.

            if (numeroTitulo == tituloanterior && i != 0) {
                i--;
                System.out.println("Titulo já cadastrado! Tente novametne ");
                numeroTitulo = in.nextInt();
                i++;
            }
            tituloanterior = numeroTitulo;

            System.out.println("Informe o número do candidato: ");
            numeroCandidato = in.nextInt();

            while ((numeroCandidato != 13 && numeroCandidato != 20)) {
                System.out.println("Numero inválido, tente novamente: ");
                numeroCandidato = in.nextInt();
            }
            if (numeroCandidato == 13) {
                candidato[0].incrementarVotos();
            }
            if (numeroCandidato == 20) {
                candidato[1].incrementarVotos();
            }

        }

        int totalVotos1 = candidato[0].getQtdVotos();
        int totalVotos2 = candidato[1].getQtdVotos();

        int total = totalVotos1 + totalVotos2;

        double percentual1 = ((double) totalVotos1 / total) * 100;
        double percentual2 = ((double) totalVotos2 / total) * 100;

        if (totalVotos1 > totalVotos2) {
            vencedor = candidato[0];
            System.out.println(vencedor);
            System.out.printf("Quantidade de votos: %d\nPercentual: %.2f", totalVotos1, percentual1);
        } else if (totalVotos2 < totalVotos1) {
            vencedor = candidato[1];
            System.out.println(vencedor);
            System.out.printf("Quantidade de votos: %d\nPercentual: %.2f", totalVotos2, percentual2);
        } else {
            System.out.println("Empate Técnico!");
        }
    }
}
