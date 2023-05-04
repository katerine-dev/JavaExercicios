package JavaExercicios.Switch;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia o período em que um aluno estuda: – M - Matutino;
– V - Vespertino;
– N - Noturno.
*/

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o período de estudo: M, V ou N");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        char periodo = entrada.next().charAt(0);

        switch (periodo) {
            case 'M':
                System.out.println("bom dia");
                break;

            case 'V':
                System.out.println("boa tarde");
                break;

            case 'N':
                System.out.println("boa noite");
                break;
        }

        entrada.close();
    }
    
}
