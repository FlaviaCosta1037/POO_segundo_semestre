package interfacesOrdenacao.Entidades;

import java.util.Comparator;
//Comparator é uma classe auxiliar de comparação
//Já ordena pela sua ordem natural
public class CompararNome implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {

        return p1.getNome().compareTo(p2.getNome());
    }
}
