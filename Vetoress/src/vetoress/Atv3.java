package vetoress;

import java.util.Arrays;
import java.util.Scanner;

public class Atv3 {

    /*
    No exame de habilitação para CNH, para tirar a Carteira Nacional de
    Habilitação (CNH), é necessário realizar um exame teórico, onde o
    candidato responde a 20 questões objetivas de uma prova, cada uma delas
    possuindo 4 alternativas (“A”, “B”, “C” e “D”) como resposta. Imagine
    que você esteja escrevendo um programa para automatizar essa prova e,
    para isso, precisa pedir que o candidato informe qual é a resposta que
    ele deu para cada uma das questões. As respostas corretas são dadas
    abaixo:

                        01. B 06. A 11. B 16. C
                        02. D 07. B 12. C 17. C
                        03. A 08. A 13. D 18. B
                        04. A 09. C 14. A 19. D
                        05. C 10. D 15. D 20. A

    O seu programa deve armazenar as respostas corretas num vetor e as
    respostas do candidato em outro vetor. Quando o usuário acabar a prova,
    o programa deve corrigi-la, dizendo se o usuário foi aprovado ou não (é
    necessário acertar no mínimo 15 questões para ser aprovado) e exibir uma
    listagem das questões que foram respondidas incorretamente.
     */
    public static void main(String[] args) {
        char respostas[] = new char[5];
        char corretas[] = {'b', 'd', 'a', 'a', 'c'};
        int gabarito = 0;
        System.out.println("Informe a suas respostas: ");
        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            respostas[i] = new Scanner(System.in).next().charAt(0);
        }
        for (int i = 0; i < corretas.length; i++) {
            if (respostas != corretas) {
                gabarito++;
            } else {
                System.out.println("Resposta incorreta!");
            }
        }
        if (gabarito > 3) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        for (int i = 0; i < corretas.length; i++) {
            if (Arrays.equals(respostas, corretas)) {
                System.out.println("Questão " + (i + 1) + " correta");
            }
        }

    }
}
