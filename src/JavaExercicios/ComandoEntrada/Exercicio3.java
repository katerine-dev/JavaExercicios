package JavaExercicios.ComandoEntrada;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia quatro números inteiros.
– calcule e mostre a soma desses números.
 */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4;

        System.out.println("Digite o valor do primeiro numero");
        n1 = entrada.nextInt();
        System.out.println("Digite o valor do segundo numero");
        n2 = entrada.nextInt();
        System.out.println("Digite o valor do terceiro numero");
        n3 = entrada.nextInt();
        System.out.println("Digite o valor do quarto numero");
        n4 = entrada.nextInt();

        entrada.close();

        System.out.println("A soma dos numeros eh:");
        int soma = n1 + n2 + n3 + n4;
        System.out.println(soma);



    }
    
}
