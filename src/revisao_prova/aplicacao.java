package revisao_prova;

import revisao_prova.Classes.Pessoa;

import java.util.Locale;

public class aplicacao {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Pessoa pessoa = new Pessoa("Flávia","01358403414","81997583813","51160400");
        System.out.println(pessoa);
    }
}
