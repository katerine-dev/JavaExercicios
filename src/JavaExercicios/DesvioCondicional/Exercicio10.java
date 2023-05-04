package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo para encontrar o maior número entre 3 números inteiros.
– O algoritmo deve ler três inteiros;
– se forem todos iguais, imprimir: “os números são iguais”; – caso contrário, imprimir o maior dos 3 números.
 */

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        int n1 = entrada.nextInt();
        System.out.println("Digite outro segundo número");
        int n2 = entrada.nextInt();
        System.out.println("Digite um terceiro número");
        int n3 = entrada.nextInt();

        if (n1 == n2 && n1 == n3) {
            System.out.println("os números são iguais");
        }

        if (n1 > n2 && n1 > n3) {
            System.out.println("maior numero: " + n1);
        }

        if (n2 > n1 && n2 > n3) {
            System.out.println("maior numero: " + n2);
        }

        if (n3 > n2 && n3 > n1) {
            System.out.println("maior numero: " + n3);
        }

        entrada.close();


    }
    
}
