package lista05;

import lista05.Classes.Candidato;
import lista05.Classes.Eleitor;

import java.util.Locale;
import java.util.Scanner;

public class programaSistemaEleitoral {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);


        Candidato candidato[] = new Candidato[2];
        candidato[0] = new Candidato("Peuzin da sacola", "Partido do Povo", 20);
        candidato[1] = new Candidato("Rita Desgramada", "Partido da Cerveja gelada", 13);

        System.out.println("=====Sistema de votação=====");
        System.out.println("========Candidatos==========\n");
        candidato[0].imprimir();
        candidato[1].imprimir();

        Eleitor eleitores[] = new Eleitor[2];

        String nomeEleitor, numeroCpf, vencedor;
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
            } else if (numeroCandidato == 20) {
                somarVotos2 = Candidato.somarVotos(i);
            }
            percentual1 = Candidato.percentual(Double.valueOf(somarVotos1),i++);
        }
        System.out.println(somarVotos1);
        System.out.println(percentual1);
        System.out.println(somarVotos2);
    }
}

