
package tostring;

import java.util.Scanner;


public class IgnoreCase {
    public static void main(String[] args) {
        System.out.println("Digitee o primeiro nome: ");
        String nome1 = new Scanner(System.in).next();
        System.out.println("Digite o segundo nome: ");
        String nome2 = new Scanner(System.in).next();
//      Ignora se é maiusculo ou minisculo.
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes iguais!");
        } else {
            System.out.println("Nomes diferentes!");
        }
    }
}
