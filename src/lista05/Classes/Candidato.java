package lista05.Classes;

public class Candidato extends Pessoa {
    private String partido;
    private int codigoCandidato;
    private int qtdVotos;

    public Candidato(String nome, String cpf, String partido, int codigoCandidato, int qtdVotos) {
        super(nome, cpf);
        this.partido = partido;
        this.codigoCandidato = codigoCandidato;
        this.qtdVotos = qtdVotos;
    }

    public Candidato(String nome, String partido, int codigoCandidato) {
        super(nome);
        this.partido = partido;
        this.codigoCandidato = codigoCandidato;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(int codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public int getQtdVotos() {
        return qtdVotos;
    }

    public int somarVotos(int soma){
        return soma += qtdVotos;
    }
    public static Double percentual(Double totalCandidato, int soma){
        Double resultado = (totalCandidato / soma) * 100;
        return resultado;
    }
    public void imprimir(){
        String candidato = "";
        candidato = String.format("Nome: %s\nPartido: %s\nCodigo do Candidato: %d\n",
                getNome(),this.partido,this.codigoCandidato);
        System.out.println(candidato);
    }

    public String toString(){
        String candidato = "";
        for(int i = 0; i < this.qtdVotos; i++) {
            candidato = String.format("Nome: %s\nCpf: %s\nPartido: %s\nCodigo do Candidato: %d\nTotal dos Votos: %d",
                    getNome(), Utils.formataCpf(getCpf()),this.partido,this.codigoCandidato,this.qtdVotos);

        }
        return candidato;
    }
}
