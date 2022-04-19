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
        candidato[0] = new Candidato("Peuzin da sacola", "Partido do Povo", 13);
        candidato[1] = new Candidato("Rita Desgramada", "Partido da Cerveja gelada", 20);

        System.out.println("=====Sistema de votação=====");
        System.out.println("========Candidatos==========\n");
        candidato[0].imprimir();
        candidato[1].imprimir();

        Eleitor eleitores[] = new Eleitor[3];

        String nomeEleitor, numeroCpf;
        Candidato vencedor;
        int numeroTitulo = 0, tituloanterior = 0, numeroCandidato;
        Double percentual1 = 0.0;
        Double percentual2 = 0.0;
        int somarVotos1 = 0;
        int somarVotos2 = 0;

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
                somarVotos1 = Candidato.somarVotos(i);
                percentual1 = Candidato.percentual(Double.valueOf(somarVotos1), eleitores.length);
            }
            if (numeroCandidato == 20) {
                somarVotos2 = eleitores.length - somarVotos1;
                percentual2 = Candidato.percentual(Double.valueOf(somarVotos2), eleitores.length);
            }

        }
        if (somarVotos1 > somarVotos2) {
            vencedor = candidato[0];
            System.out.println(vencedor);
            System.out.printf("Quantidade de votos: %d\nPercentual: %.2f",somarVotos1,percentual1);
        } else if(somarVotos1 < somarVotos2) {
            vencedor = candidato[1];
            System.out.println(vencedor);
            System.out.printf("Quantidade de votos: %d\nPercentual: %.2f",somarVotos2,percentual2);
        }else {
            System.out.println("Empate Técnico!");
        }
    }
}
