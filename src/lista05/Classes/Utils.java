package lista05.Classes;

import java.util.Locale;

public class Utils{
    private String formataCpf;

    public static String formataCpf(String cpf){
       return cpf = cpf.substring(0,3) + "." + cpf.substring(3,6) + "."
               + cpf.substring(6,9) + "-" + cpf.substring(9,11);
    }
}
