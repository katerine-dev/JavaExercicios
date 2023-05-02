package JavaExercicios.ComandoEntrada;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia o salário de um funcionário.
– sabendo que o salário do funcionário teve um aumento de 25%
– calcular e mostrar o novo salário.
 */

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;
        System.out.println("Digite o seu salario");
        salario = entrada.nextDouble();
        entrada.close();

        System.out.println("salario atual:");
        System.out.println(salario);

        System.out.println("calculando o aumento");
        double aumentoSalario;
        aumentoSalario = salario * (1 + 0.25);

        System.out.println(aumentoSalario);


    }
    
}
