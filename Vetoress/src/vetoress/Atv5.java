package vetoress;

import java.util.Arrays;
import java.util.Scanner;

public class Atv5 {

    /*
    Lista telefônica – Utilizando dois vetores paralelos, crie um programa
    que armazene o nome de 10 pessoas num deles e os números de telefone
    dessas pessoas no outro (essas informações devem ser fornecidas pelo
    usuário). Ao final, o programa deve pedir ao usuário que informe o nome
    de uma pessoa e mostre o número dela. Caso esse nome não exista, deve-
    se exibir uma mensagem de erro. Faça um laço para que o usuário possa
    indicar se deseja continuar pesquisando por mais números de telefone ou
    se deseja encerrar o programa.
     */
    public static void main(String[] args) {
        String nome[] = new String[10];
        String numero[] = new String[10];
        String opcao;
        char resp;
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nome[i] = new Scanner(System.in).next();
            System.out.print("Digite o número da pessoa: ");
            numero[i] = new Scanner(System.in).next();
        }
        do {
            System.out.print("Digite o nome da pessoa que deseja consultar: ");
            opcao = new Scanner(System.in).nextLine();
            int cont = 0;
            for (int i = 0; i < nome.length; i++) {
                if (opcao.equals(nome[i])) {
                    System.out.println("Nome: " + nome[i]);
                    System.out.println("Telefone " + numero[i]);
                    cont++;
                }
            }
            if (cont == 0) {
                System.out.println("Numero não cadastrado!");
            }
            System.out.print("Você deseja realizar outra consulta? ");
            resp = new Scanner(System.in).nextLine().charAt(0);
        } while (resp == 'S');
        System.out.println("Programa encerrado!");

    }
}
