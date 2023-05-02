package JavaExercicios.ComandoEntrada;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que receba um número, calcule e mostre:
– O número elevado ao quadrado;
– O número elevado ao cubo;
– A raiz quadrada do número digitado;
– O número elevado a potência 10;
 */

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero");
        numero = entrada.nextInt();
        entrada.close();

        System.out.println("Numero elevado ao quadrado");
        System.out.println(Math.pow(numero, 2));

        System.out.println("Numero elevado ao cubo");
        System.out.println(Math.pow(numero, 3));

        System.out.println("raiz quadrada");
        System.out.println(Math.sqrt(numero));

        System.out.println("elevado a 10");
        System.out.println(Math.pow(numero, 10));

    }
    
}
