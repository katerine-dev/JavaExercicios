package JavaExercicios.Vetores;
import java.util.Random;

/**
 * @author katerinelindawitkoski
 */

/*
Sorteie 10 números inteiros e armazene-os em um vetor. – Percorra o vetor e encontre o menor elemento.
– Sorteie números entre 1 e 10.
*/

public class Exercicio3 {
    public static void main(String[] args) {

        Random gerador = new Random();

        int numeros[] = new int[10];

        // gerando numeros no intervalo de 30 a 50
        // e armazenando no vetor
        for (int i = 0; i < 10; i++) {
            numeros[i] = 20 + gerador.nextInt(30 + 1);
        }

        int menorElemento = numeros[0];

        // procurando o menor elemento no vetor
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < menorElemento) {
                menorElemento = numeros[i];
            }
        }

        // imprimindo o conteudo do vetor
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("menor elemento: " + menorElemento);
    }
    
}
