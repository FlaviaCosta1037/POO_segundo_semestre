package revisao_prova.Classes;

public class Utils {
    public String formataCpf;
    public String formataTelefone;
    public String formataCep;

    public Utils(String formataCpf, String formataTelefone, String formataCep) {
        this.formataCpf = formataCpf;
        this.formataTelefone = formataTelefone;
        this.formataCep = formataCep;
    }
    public static String formataCpf(String cpf){
        return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
    }
    public static String formataTelefone(String telefone){
        return "("+ telefone.substring(0,2) +")" + telefone.substring(2,3) + " " + telefone.substring(3,7) + "-" + telefone.substring(7,11);
    }
    public static String formataCep(String cep){
        return cep.substring(0,2) + "." + cep.substring(2,5) + "-" + cep.substring(5,8);
    }
}
