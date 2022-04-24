package revisao_prova.Classes;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(Double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }


    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {

        this.localizacao = localizacao;
    }
    public double obterValor(double valor, double valorAdicional){
        return valor += valorAdicional;
    }

    @Override
    public String toString() {
        return "Camarote Inferior\n" +
                "Localizacao " + localizacao +
                "\nValor: " + obterValor(getValor(),getValorAdicional());
    }
}

