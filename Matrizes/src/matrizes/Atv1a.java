package matrizes;

import java.util.Scanner;

public class Atv1a {

    /*Faça um programa que leia uma matriz MxN, onde M e N são informados
    pelo usuário, e que imprima o maior valor encontrado na matriz.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual é o tamanho de |M|? ");
        int m = leitor.nextInt();
        System.out.print("Qual é o tamanho de |N|? ");
        int n = leitor.nextInt();
        int matriz[][] = new int[m][n];
        int maior = 0;
        for (m = 0; m < matriz.length; m++) {
            for (n = 0; n < matriz[m].length; n++) {
                System.out.println("Informe os valores: ");
                matriz[m][n] = leitor.nextInt();
                if (maior < matriz[m][n]) {
                    maior = matriz[m][n];
                }
            }
        }
        System.out.println("O maior valor encontrado foi " + maior);
    }

}
