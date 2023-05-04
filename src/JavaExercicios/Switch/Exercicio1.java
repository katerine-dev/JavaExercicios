package JavaExercicios.Switch;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Crie um algoritmo que leia um número de 1 a 7. – imprima o dia da semana correspondente;
– assuma que 1 corresponde ao Domingo.
*/

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("dia da semana inválido");
        }
        entrada.close();
    }
    
}
