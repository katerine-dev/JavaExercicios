package JavaExercicios.Switch;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que receba dois números; – executeasoperaçõeslistadasaseguir...
– de acordo com a escolha do usuário.
*/

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        int n1 = entrada.nextInt();

        System.out.println("Digite outro número");
        int n2 = entrada.nextInt();

        System.out.println("Digite uma opção entre M, S, P ou D");
        char opcao = entrada.next().charAt(0);

        switch (opcao) {
            case 'M':
                System.out.println((n1 + n2) / 2);
                break;

            case 'S':
                if (n1 > n2) {
                    System.out.println(n1 - n2);
                } else {
                    System.out.println(n2 - n1);
                }
                break;

            case 'P':
                System.out.println(n1 * n2);
                break;

            case 'D':
                System.out.println(n1 / n2);
                break;

            default:
                System.out.println("opcao invalida");
        }

        entrada.close();
    }
    
}
