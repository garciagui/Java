package vetoress;

public class Atv2 {

    /*
    Preencher um vetor com os números pares do número 2 ao 20, após
    preencher outro vetor com os números de 10 a 19. Mostre a soma dos dois
    vetores.
     */
    public static void main(String[] args) {
        int vetorUm[] = new int[10];
        int vetorDois[] = new int[10];
        int somaVetores[] = new int[10];
        
        //Vai receber 2 na posição 0 e o contador vai começar com 1.
        System.out.println("\t\t***Valor dos pares***");
        vetorUm[0] = 2;
        for (int i = 1; i < vetorUm.length; i++) {
            vetorUm[i] = vetorUm[i - 1] + 2;
        }
        for (int i = 0; i < vetorUm.length; i++) {
            System.out.print(vetorUm[i] + "\t");
        }
        
        // Vai receber 10 na primeira posição(0) como valor inicial.
        System.out.println("\n\t\t***Valores de 10 a 19***");
        vetorDois[0] = 10;
        for (int i = 1; i < vetorDois.length; i++) {
            vetorDois[i] = vetorDois[i - 1] + 1;
        }
        for (int i = 0; i < vetorDois.length; i++) {
            System.out.print(vetorDois[i] + "\t");
        }
        
        
        System.out.println("\n\t\t***Soma dos dois vetores***");
        for (int i = 0; i < somaVetores.length; i++) {
            somaVetores[i] = vetorUm[i] + vetorDois[i];
        }
        for (int i = 0; i < somaVetores.length; i++) {
            System.out.print(somaVetores[i] + "\t");
        }
        System.out.println("\n");
    }
}
