package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Ler o salário de uma pessoa e calcular e imprimir o desconto do INSS (calculado!!)
de acordo com a tabela a seguir:

 */

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe seu salário");
        double salario = entrada.nextDouble();

        double desconto;

        if (salario <= 600) {
            System.out.println("isento");
        } else if (salario > 600 && salario <= 1200) {
            desconto = salario * 0.2;
            System.out.println("Desconto: " + desconto);
        } else if (salario > 1200 && salario <= 2000) {
            desconto = salario * 0.25;
            System.out.println("Desconto: " + desconto);
        } else if (salario > 2000) {
            desconto = salario * 0.30;
            System.out.println("Desconto: " + desconto);
        }

        entrada.close();


    }
    
}
