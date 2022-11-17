package tostring;

import java.util.Scanner;

public class upper {

    public static void main(String[] args) {
        System.out.println("Digitee o primeiro nome: ");
        String nome1 = new Scanner(System.in).next();
        System.out.println("Digite o segundo nome: ");
        String nome2 = new Scanner(System.in).next();
//        Deixa todos as String em maiusculo.
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais!");
        } else {
            System.out.println("Nomes diferenes!");
        }
        System.out.println(nome1);
        System.out.println(nome2);
    }
}
