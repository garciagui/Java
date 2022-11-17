package vetoress;

import java.util.Arrays;
import java.util.Scanner;

public class Atv1a {

    /*
    Crie um programa que armazene o nome dos 20 alunos da turma e
    mostre a relação em ordem alfabética.
     */
    public static void main(String[] args) {
        String alunos[] = new String[20];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = new Scanner(System.in).nextLine();
        }
        Arrays.sort(alunos);
        System.out.println("Alunos em ordem alfabetica\n");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }
}
