package matrizes;

public class Atv2 {

    /*
    Para cada conjunto de valores abaixo, escreva o código Java, usando
    laço(s) que preencha uma matriz com os valores:
    a) 0 1 2 3 4 5 6 7 8 9     
       0 1 2 3 4 5 6 7 8 9
       0 1 2 3 4 5 6 7 8 9
     */
    public static void main(String[] args) {
        int m[][] = new int[3][10];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = j;

            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
