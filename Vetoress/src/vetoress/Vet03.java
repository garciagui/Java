package vetoress;

import java.util.Arrays;

public class Vet03 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        //coloca o vetor em ordem.
        Arrays.sort(v);
        for (double valor : v) {
            System.out.print(valor + " ");
        }
    }

}
