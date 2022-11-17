package tostring;

import java.util.Scanner;

public class charAt {

    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        String nome1 = new Scanner(System.in).next();
        System.out.print("Inverso: ");
//      Mostra o inverso de acordo com a posição do vetor.
//      Precisa botar () por causa da contagem de parametros.
//      String transformada em vetor.
//      charAt(i) mostra o caracter que está no indice.
        for (int i = nome1.length() - 1; i >= 0; i--) {
            System.out.print(nome1.charAt(i));
        }
        System.out.println();
    }

}
