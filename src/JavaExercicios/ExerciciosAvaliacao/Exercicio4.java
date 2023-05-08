package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma,
média, produto e os números menores e maiores.
 */

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros;
        int contador = 0;
        int menorValor = 0;
        int maiorValor = 0;

        while (contador < 10) {
            System.out.println("Digite um numero");
            numeros = entrada.nextInt();


            if (contador == 0) {
                menorValor = numeros;
                maiorValor = numeros;
            }

            if (menorValor > numeros) {
                menorValor = numeros;
            }
            if (maiorValor < numeros){
                maiorValor = numeros;
            }

            contador++;
        }
        entrada.close();

        System.out.println("O menor número: " + menorValor);
        System.out.println("O maior número: " + maiorValor);

    }
    
}
