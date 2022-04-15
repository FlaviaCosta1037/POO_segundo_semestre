package lista04_objetos.Classes;

public class Utils {
    private String cpf;
    private String telefone;

    public Utils(String cpf, String telefone) {
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public static String formataCpf(String cpf){
       cpf = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9)
               + "-" + cpf.substring(9,11);
       return cpf;
    }
    public static String formataTelefone(String telefone){
        telefone = "(" + telefone.substring(0,2) + ")" + telefone.substring(2,7) +
                "-" + telefone.substring(7,11);
        return telefone;
    }
}
