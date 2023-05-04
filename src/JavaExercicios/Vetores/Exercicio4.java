package JavaExercicios.Vetores;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Leia 5 elementos em um vetor inteiro A.
– construa um outro vetor B, de mesma dimensão de A,
– sendo que, seus elementos são a multiplicação dos elementos de A por 3.
– mostre os elementos de B.
*/

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetorA[] = new int[8];
        int vetorB[] = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o elemento " + (i + 1));
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i] * 3;
        }

        System.out.println("Imprimindo os elementos do vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("elemento " + (i + 1) + "  " + vetorB[i]);
        }

        entrada.close();
    }
    
}
