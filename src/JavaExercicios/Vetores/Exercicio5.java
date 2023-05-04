package JavaExercicios.Vetores;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Leia dois vetores A e B de mesmo tamanho.
– construa o vetor C, de mesmo tamanho,
– cujo elementos de C são a subtração dos elementos de A por B.
– mostre C.
*/

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        System.out.println("Lendo valores para o vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = entrada.nextInt();
        }

        System.out.println("Lendo valores para o vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = entrada.nextInt();
        }

        // computando valores para o vetor C
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Imprimindo os elementos do vetor C");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("posicao " + i + ": " + vetorC[i]);

        }

        entrada.close();
    }
    
}
