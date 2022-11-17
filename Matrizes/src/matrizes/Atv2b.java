package matrizes;

public class Atv2b {

    /*
    Para cada conjunto de valores abaixo, escreva o código Java, usando
    laço(s) que preencha uma matriz com os valores:
    b)  0 0 0 0 0 0
        1 1 1 1 1 1
        2 2 2 2 2 2
        3 3 3 3 3 3
        4 4 4 4 4 4
        5 5 5 5 5 5
     */
    public static void main(String[] args) {

        int m[][] = new int[6][6];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = i;

            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
