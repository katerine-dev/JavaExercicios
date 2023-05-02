package JavaExercicios.ComandoEntrada;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Construir um algoritmo que calcule:
– a área de um triângulo dado a base e a altura;
– área = (altura x base)/2
 */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("Digite a base do triangulo");
        base = entrada.nextDouble();

        System.out.println("Digite a altura do triangulo");
        altura = entrada.nextDouble();

        entrada.close();

        System.out.println("Calculando a area do triangulo");
        area = (base * altura) / 2;

        System.out.println(area);


    }
    
}
