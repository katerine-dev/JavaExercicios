package JavaExercicios.Vetores;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
[2.] Leia 5 nomes de pessoas e armazene-os em um vetor.
– Mostre na tela os nomes do último para o primeiro.
*/

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite nome " + (i + 1));
            nomes[i] = entrada.next();
        }

        System.out.println("****** Nomes lidos *******");

        for (int i = 4; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        entrada.close();
    }
    
}
