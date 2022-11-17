package matrizes;

import java.util.Scanner;

public class Atv1b {

    /*
    Realize a leitura de duas matrizes de inteiros, a primeira chamada de A
    de dimensões 3 x 4 e a segunda chamada de B de dimensões 3 x 2.
    Construa uma matriz C de dimensões 3 x 6, sendo essa a junção das
    duas outras matrizes. Para isso, você deve copiar os elementos das
    matrizes A e B para a matriz C.
     */
    public static void main(String[] args) {
        int a[][] = new int[3][4];
        int b[][] = new int[3][2];
        int c[][] = new int[3][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Digite os elementos da matriz A: ");
                a[i][j] = new Scanner(System.in).nextInt();
                c[i][j] = a[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Digite os elementos da matriz B: ");
                b[i][j] = new Scanner(System.in).nextInt();
                c[3][6] = b[i][j];
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("Valores de C " + c[i][j]);
            }
        }

    }
}
