package tostring;

import java.util.Scanner;

public class indexOf {

    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        String nome1 = new Scanner(System.in).next();
        char ponto = '.';
        System.out.println("A posição do ponto no texto é: "
                //Procura o caracter no texto digitado 
                + nome1.indexOf(ponto));
        System.out.println();
    }

}
