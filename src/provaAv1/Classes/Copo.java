package provaAv1.Classes;

public class Copo {
    private int capacidadeMaxima;
    private int capacidadeAtual;
    private String cor;

    public Copo(int capacidadeMaxima, int capacidadeAtual, String cor) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeAtual = capacidadeAtual;
        this.cor = cor;
    }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    private void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCapacidadeAtual() {
        return this.capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void adicionarLiquido(int qtd) {
        this.capacidadeAtual += qtd;
        if (this.capacidadeAtual > this.capacidadeMaxima) {
            this.capacidadeAtual = this.capacidadeMaxima;
            System.out.println("O líquido esborrou!");
        }
    }

    public void esvaziar() {
        System.out.println("\nEsvazia todo o copo!\n");
        this.capacidadeAtual -= this.capacidadeAtual;
    }

    public void obterInformacoes() {
        System.out.printf("O copo " + getCor() + " armazena até " +
                getCapacidadeMaxima() + " ml e atualmente contém " + getCapacidadeAtual() + " de líquido\n");
    }
}