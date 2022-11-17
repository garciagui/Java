package vetoress;

import java.util.Arrays;
import java.util.Scanner;

public class Atv1b {

    /*
    Altere o programa solicitando também a nota final do semestre de cada
    aluno e por fim, mostre o nome dos alunos que atingiram a média (7),
    com suas respectivas notas.
     */
    public static void main(String[] args) {
        int notaFinal = 0;
        String alunos[] = new String[2];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = new Scanner(System.in).next();
            System.out.println("Digite a nota final do aluno: ");
            notaFinal = new Scanner(System.in).nextInt();
        }
        Arrays.sort(alunos);
        for (int i = 0; i < alunos.length; i++) {
            if (notaFinal > 7) {
                System.out.println(alunos[i] + "Atingiu a média 7");
            }
        }
    }
}
