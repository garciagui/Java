package matrizes;

import java.util.Scanner;

public class Atv3 {

    /*
    Capture do teclado valores para preenchimento de uma matriz 3x3. Após
    a captura imprima a matriz criada e informe a quantidade de números pares
    e a quantidade de números ímpares.
     */
    public static void main(String[] args) {
        int valores[][] = new int[3][3];
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.println("Digite os valores da matriz");
                valores[i][j] = new Scanner(System.in).nextInt();
                if (valores[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\n");
        System.out.println("Valores pares digitados " + pares);
        System.out.println("Valores impares digitados " + impares);
    }

}
