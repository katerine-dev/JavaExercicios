package JavaExercicios.Switch;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
 Um funcionário receberá aumento de acordo com seu plano de trabalho.
– Faça um algoritmo que leia:
 ̈ o plano de trabalho;
 ̈ e o salário atual de um funcionário;
– Calcule e imprima o seu novo salário.
*/

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu plano de trabalho");
        char plano = entrada.next().charAt(0);

        System.out.println("Digite o seu salário atual");
        double salario = entrada.nextDouble();

        double novoSalario;

        switch (plano) {
            case 'A':
                novoSalario = salario * (1 + 0.1);
                break;

            case 'B':
                novoSalario = salario * (1 + 0.15);
                break;

            case 'C':
                novoSalario = salario * (1 + 0.2);
                break;

            default:
                System.out.println("plano invalido");
                novoSalario = salario;
        }

        System.out.println("Novo salario: " + novoSalario);

        entrada.close();
    }
    
}
