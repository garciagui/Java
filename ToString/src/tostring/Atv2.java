package tostring;

import java.util.Scanner;

public class Atv2 {

    public static void main(String[] args) {
        /*Faça um programa que apartir de uma String 
        digitada pelo úsuario,imprima:*/
        System.out.println("Digite um texto: ");
        String texto = new Scanner(System.in).next();
        //A) O numero de caracteres da String
        System.out.println("A String tem " + texto.length() + " caracteres.");
        //B) A String com todas suas letras em minúsculo.
        System.out.println("Todas as Strings em minúsculo: " + texto.toLowerCase());
        //C) O número de vogais da String.
        String vogais = "aeiou";
        int numV = 0;
        for (int i = 0; i < vogais.length(); i++) {
            for (int j = 0; j < texto.length(); j++) {
                char v = vogais.charAt(i);
                char t = texto.charAt(j);
                if (v == t) {
                    numV++;
                }
            }
        }
        System.out.println("A String tem " + numV + " vogais");
        /*D) Se a String digitada termina com “as” 
        (ignorando maiúsculas/minúsculas).*/
        if (texto.substring(texto.length() - 2).equalsIgnoreCase(texto)) {
            System.out.println("Palavra terminada em AS");
        } else {
            System.out.println("Palavra não terminada em AS");
        }

    }

}
