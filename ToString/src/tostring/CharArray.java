package tostring;

import java.util.Scanner;

public class CharArray {

    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        String nome1 = new Scanner(System.in).next();
//       Mostra o inverso da String digitada.
        char[] caracteres = nome1.toCharArray();
        System.out.print("Inverso: ");
//       Quando decrementa(i--) deve se acrecentar .lenght - 1. 
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
        System.out.println();
    }

}
