package interfacesOrdenacao.Entidades;


public class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int compareTo(Conta conta) {
        if(this.getNumero() < conta.getNumero()){
            return -1;
        }
        if(this.getNumero() > conta.getNumero()){
            return 1;
        }
        return 0;
    }
}
