package vetoress;
public class Atv4 {
    /*
    Preencher um vetor com 8 elementos inteiros e mostrar:
     */
    public static void main(String[] args) {
        int v[] = {43, 46, 87, 10, 5, 45, 46, 876};
        int media = 0;
        int maior = 0;
        int menor = 0;
        int big = 0;
        //a) o vetor na horizontal (com \t);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        //b) a média aritmética do vetor;
        System.out.println("\n");
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= 0) {
                media += v[i];
            }
        }
        //c) quantos números são múltiplos de 5;
        System.out.println("A média aritmetica do vetor é " + (media / v.length));
        System.out.println("\n");
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 5 == 0) {
                System.out.println("O elemento " + v[i] + " na posição " + i
                        + " é multiplo de 5!");
            }
        }
        //d) quantos números são maiores que 10;
        //e) quantos números são menores que 30;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > 10) {
                maior++;
            }
            if (v[i] < 30) {
                menor++;
            }
        }
        System.out.println("\n");
        System.out.println(maior + " Vetores são maiores que 10");
        System.out.println(menor + " Vetores são menores que 30");
        //f) qual o maior número do vetor.
        for (int i = 0; i < v.length; i++) {
            //Se o elemento for maior que 0 vai acrescentrar o maior valor.
            if (v[i] > big) {
                big = v[i];
            }
        }
        System.out.println("\n");
        System.out.println("O maior valor do vetor é " + big);
    }
}
