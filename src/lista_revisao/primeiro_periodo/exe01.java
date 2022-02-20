package lista_revisao.primeiro_periodo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
/*Construa um vetor A com 10 elementos inteiros, construa também
um vetor B sendo que cada elemento do vetor B será o elemento do vetor A * 3.
 */
public class exe01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int vetA [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int vetB[] = new int[10];

        for (int i = 0; i < vetB.length; i++){
            vetB[i] = vetA[i] * 3;
            System.out.print(Arrays.asList(vetB[i]));
        }

    }
}
