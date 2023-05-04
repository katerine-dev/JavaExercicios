package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia um número inteiro. – Se o número for maior que 20...
– calcular e imprimir a metade dele.
 */

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero");
        numero = entrada.nextInt();

        if (numero > 20) {
            double metade = 20 / 2;
            System.out.println(metade);
        }

        entrada.close();



    }
    
}
