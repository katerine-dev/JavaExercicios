package JavaExercicios.ComandoEntrada;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Sabe-se que um quilowatt de energia custa 1/500 avos do salário mínimo.
– Faça um algoritmo que receba o valor do salário mínimo e a quantidade de
quilowatts consumida por uma residência.
Calcule e mostre:
 ̈ o valor, em reais, de cada quilowatt;
 ̈ o valor, em reais, a ser pago por essa residência;
 ̈ o valor, em reais, a ser pago com desconto de 15%.
 */

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioMinimo = 0;
        double qtdeQuilowatts = 0;
        double valorCadaQuilowatt = 0;
        double valorPagar = 0;
        double valorComDesconto = 0;

        System.out.println("Informe o salario minimo");
        salarioMinimo = entrada.nextDouble();

        System.out.println("Informe a quantidade de quilowatts consumida");
        qtdeQuilowatts = entrada.nextDouble();
        entrada.close();

        valorCadaQuilowatt = salarioMinimo / 500;
        System.out.println("Valor em reais de cada quilowatts: " + valorCadaQuilowatt);

        valorPagar = valorCadaQuilowatt * qtdeQuilowatts;
        System.out.println("Valor em reais a ser pago: " + valorPagar);

        valorComDesconto = valorPagar * (1 - 0.15);
        System.out.println("Valor em reais com desconto: " + valorComDesconto);


    }
    
}
