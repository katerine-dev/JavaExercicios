package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
• A empresa XSoftware concedeu um bônus de 20% do valor do salário a todos os funcionários com tempos de trabalho na empresa igual ou superior a cinco anos e de 10% aos demais funcionários.
• Faça um algoritmo que leia o salário e a quantidade de anos de cada funcionário, calcule e imprima o valor do bônus.
 */

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salario");
        double salario = entrada.nextDouble();

        System.out.println("Digite o seu tempo de empresa");
        int tempo = entrada.nextInt();

        double bonus;
        if (tempo >= 5) {
            bonus = salario * 0.2;
        } else {
            bonus = salario * 0.1;
        }

        System.out.println("Bonus:");
        System.out.println(bonus);
        entrada.close();


    }
    
}
