package JavaExercicios.EstruturasRepeticao;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Construir um algoritmo que leia um número inteiro e imprime a sequência:
– 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024...
– enquanto o valor da sequência for menor ou igual ao número lido.
*/

public class Exercicio3 {
    public static void main(String[] args) {

        double variavelControle = 0;
        int numeroLido;
        double valorMostrado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor:");
        numeroLido = entrada.nextInt();

        valorMostrado = Math.pow(2, variavelControle);

        while (valorMostrado <= numeroLido) {
            System.out.print(valorMostrado + " ");
            variavelControle++;
            valorMostrado = Math.pow(2, variavelControle);
        }

        entrada.close();
    }
    
}
