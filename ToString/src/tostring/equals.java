package tostring;

import java.util.Scanner;

public class equals {

    public static void main(String[] args) {
        System.out.println("Digitee o primeiro nome: ");
        String nome1 = new Scanner(System.in).next();
        System.out.println("Digite o segundo nome: ");
        String nome2 = new Scanner(System.in).next();
//        Verifica se a string é iguala outra.
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais!");
        } else {
            System.out.println("Nomes diferentes!");
        }

    }

}
