package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que leia dois inteiros,
além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
[Dica: utilize o operador de resto.]
 */

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inteiro1 = 0;
        int inteiro2 = 0;

        System.out.println("Digite o primeiro inteiro");
        inteiro1 = entrada.nextInt();

        System.out.println("Digite o segundo inteiro");
        inteiro2 = entrada.nextInt();
        entrada.close();


        if (inteiro1 % inteiro2 == 0) {
            System.out.println("O primeiro número é múltiplo do segundo número");
        } else {
            System.out.println("Não é múltiplo");
        }

    }
    
}
