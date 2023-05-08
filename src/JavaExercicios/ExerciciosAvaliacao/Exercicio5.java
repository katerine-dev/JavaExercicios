package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par.
[Dica: utilize o operador de resto. Um número par é um múltiplo de 2.
Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inteiro = 0;

        System.out.println("Digite um inteiro");
        inteiro = entrada.nextInt();

        entrada.close();

        if (inteiro % 2 == 0) {
            System.out.println("Ele é um número par");
        } else {
            System.out.println("Ele é um número ímpar");
        }

    }
    
}
