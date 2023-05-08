package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma,
média, produto e os números menores e maiores.
 */

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inteiro1 = 0;
        int inteiro2 = 0;
        int inteiro3 = 0;

        System.out.println("Digite o primeiro inteiro");
        inteiro1 = entrada.nextInt();
        System.out.println("Digite o segundo inteiro");
        inteiro2 = entrada.nextInt();
        System.out.println("Digite o terceiro inteiro");
        inteiro3 = entrada.nextInt();
        entrada.close();

        // operações
        int soma = inteiro1 + inteiro2 + inteiro3;
        int produto = inteiro1 * inteiro2 * inteiro3;
        int media = (inteiro1 + inteiro2 + inteiro3)/3;


        System.out.println("A soma desses inteiros é: " + soma);
        System.out.println("O produto desses inteiros é: " + produto);
        System.out.println("A média desses inteiros é: " + media);

        // Maior número
        if (inteiro1 > inteiro2 && inteiro1 > inteiro3) {
            System.out.println(inteiro1 + " é o maior número");
        } else if (inteiro2 > inteiro1 && inteiro2 > inteiro3){
            System.out.println(inteiro2 + " é o maior número");
        } else if (inteiro3 > inteiro1 && inteiro3 > inteiro2) {
            System.out.println(inteiro3 + " é o maior número");
        }

        // Menor número
        if (inteiro1 < inteiro2 && inteiro1 < inteiro3) {
            System.out.println(inteiro1 + " é o menor número");
        } else if (inteiro2 < inteiro1 && inteiro2 < inteiro3){
            System.out.println(inteiro2 + " é o menor número");
        } else if (inteiro3 < inteiro1 && inteiro3 < inteiro2) {
            System.out.println(inteiro3 + " é o menor número");
        }

    }
    
}
