package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
 Escreva um aplicativo que solicite ao usuário inserir dois inteiros,
 obtenha dele esses números e imprima sua soma, produto,
 diferença e quociente (divisão)
 */

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inteiro1 = 0;
        int inteiro2 = 0;

        System.out.println("Digite o primeiro inteiro");
        inteiro1 = entrada.nextInt();
        System.out.println("Digite o segundo inteiro");
        inteiro2 = entrada.nextInt();
        entrada.close();

        // operações
        int soma = inteiro1 + inteiro2;
        int produto = inteiro1 * inteiro2;
        int diferenca = inteiro1 - inteiro2;
        int quociente = inteiro1 / inteiro2;

        System.out.println("A soma desses inteiros é: " + soma);
        System.out.println("O produto desses inteiros é: " + produto);
        System.out.println("A diferença desses inteiros é: " + diferenca);
        System.out.println("O quociente desses inteiros é: "+ quociente);


    }
    
}
