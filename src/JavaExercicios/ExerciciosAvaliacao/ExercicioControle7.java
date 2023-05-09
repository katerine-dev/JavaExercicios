package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário,
determina e imprime se eles poderiam representar os lados de um triângulo.
 */


public class ExercicioControle7 {
    public static void main(String[] args) {
        int[] lados = new int[3];
        Scanner entrada = new Scanner(System.in);

        // para formar um triângulo:
        // a soma de dois lados é sempre menor que o terceiro lado.

        for (int i = 0; i < lados.length; i++) {
            System.out.println("Digite o comprimento do lado");
            lados[i] = entrada.nextInt();
        }

        if ((lados[0] + lados[1] > lados[2]) &&
                (lados[0] + lados[2] > lados[1]) &&
                (lados[1] + lados[2] > lados[0])) {
            System.out.println("Pode ser um triângulo");
        } else {
            System.out.println("Não pode ser um triângulo");
        }

        entrada.close();
    }

}
