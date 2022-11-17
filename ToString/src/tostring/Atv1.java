package tostring;

import java.util.Scanner;

public class Atv1 {

    /* Crie um programa que lê uma String e imprima apenas
    os cacteres de indice impar.
     */
    public static void main(String[] args) {
        System.out.println("Digite um texto: ");
        String texto = new Scanner(System.in).next();
        for (int i = 0; i < texto.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(texto.charAt(i));
            }
        }
    }
}
