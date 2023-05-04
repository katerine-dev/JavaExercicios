package JavaExercicios.Vetores;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
[1.] Leia 10 valores inteiros e armazene-os em um vetor.
– Em seguida imprima todos os elementos.
*/

public class Exercicio1 {
    public static void main(String[] args) {

        int[] valores = new int[5];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor");
            valores[i] = entrada.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("valor: " + valores[i]);
        }

        entrada.close();
    }
    
}
