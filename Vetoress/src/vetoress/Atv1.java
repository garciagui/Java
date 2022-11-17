package vetoress;

import java.util.Scanner;

public class Atv1 {

    /*Faça um programa que leia 100 valores e os escreva na ordem contrária
    à que foram digitados.*/
    public static void main(String[] args) {
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor: ");
            vetor[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Ordem contraria");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + "\n");
        }
    }
}
