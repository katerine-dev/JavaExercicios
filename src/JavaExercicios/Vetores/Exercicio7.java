package JavaExercicios.Vetores;



/**
 * @author katerinelindawitkoski
 */

/*
Criar um vetor para armazenar 10.000 números inteiros.
– os número devem ser gerados de forma aleatória no intervalo entre 0 e 10.
– após criar o vetor, contar a quantidade de vezes que cada número foi sorteado.
*/

public class Exercicio7 {
    public static void main(String[] args) {

        // gerador de numeros aleatorios
        Random gerador = new Random();

        // vetor para armazenar 10000 numeros
        int numeros[] = new int[10000];

        // colocando valores no vetor
        for (int i = 0; i < 10000; i++) {
            numeros[i] = 0 + gerador.nextInt(9 + 1);
        }

        // criando um vetor de contadores
        int contadores[] = new int[10];

        // conta quantas vezes cada numero apareceu
        // e armazena no vetor de contadores
        for (int i = 0; i < 10000; i++) {
            contadores[numeros[i]]++;
        }

        // imprimindo a quantidade de vezes que cada numero apareceu
        for (int i = 0; i < 10; i++) {
            System.out.println("O numero " + i + " apareceu: " + contadores[i] + " vezes");
        }
    }
    
}
