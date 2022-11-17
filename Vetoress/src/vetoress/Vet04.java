package vetoress;

import java.util.Arrays;

public class Vet04 {

    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v);
        }
        //Encontra o numero dentro do vetor.
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontre o valor na posição " + p);

    }

}
