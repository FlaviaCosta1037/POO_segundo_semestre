package lista05.Classes;

import jdk.jshell.execution.Util;

public class Candidato extends Pessoa {
    private String partido;
    private int codigoCandidato;
    private int qtdVotos = 0;

    public Candidato(String nome, String cpf, String partido, int codigoCandidato) {
        super(nome, cpf);
        this.partido = partido;
        this.codigoCandidato = codigoCandidato;
    }

    public Candidato(String nome, String partido, int codigoCandidato) {
        super(nome);
        this.partido = partido;
        this.codigoCandidato = codigoCandidato;
    }
    public Candidato(String cpf) {
        super(cpf);
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.setPartido(partido);
    }

    public int getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(int codigoCandidato) {
        this.setCodigoCandidato(codigoCandidato);
    }

    public int getQtdVotos() {
        return qtdVotos;
    }

    public void incrementarVotos(){
        this.qtdVotos++;
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
            candidato = "Nome: " + super.getNome() + "\nCpf: " + Utils.formataCpf(super.getCpf()) +
                    "\nPartido: " + this.partido + "\nCodigo do Candidato: " + this.codigoCandidato;

        return candidato;
    }
}
