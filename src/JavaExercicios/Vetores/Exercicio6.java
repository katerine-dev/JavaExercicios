package JavaExercicios.Vetores;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Leia dois vetores: A (de tamanho 4) e B (de tamanho 7).
– Construa um terceiro vetor que seja a junção de A e B
– colocar os elementos de A, e em sequência, colocar os elementos de B.
*/

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetorA[] = new int[4];
        int vetorB[] = new int[7];
        int vetorC[] = new int[11];

        System.out.println("lendo os elementos do vetor A");
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o elemento da posicao " + i);
            vetorA[i] = entrada.nextInt();
        }

        System.out.println("Lendo os elementos do vetor B");
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o elemento da posicao " + i);
            vetorB[i] = entrada.nextInt();
        }

        // copiando os elementos do vetor A para o vetor C
        // as 4 primeiras posicoes do vetor C serao preenchidas com os elementos de A
        for (int i = 0; i < 4; i++) {
            vetorC[i] = vetorA[i];

        }

        // copiando os elementos do vetor B para o o vetor C
        // precisa comecar a armazenar os elementos na posicao 4 em diante
        for (int i = 0; i < 7; i++) {
            // i + 4 porque precisa comecar na posicao 4
            vetorC[i + 4] = vetorB[i];
        }

        System.out.println("Imprimindo os elementos do vetor C");
        for (int i = 0; i < 11; i++) {
            System.out.println("posicao " + i + ": " + vetorC[i]);
        }

        entrada.close();
    }
    
}
