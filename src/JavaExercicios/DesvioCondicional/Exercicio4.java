package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Ler dois números (ponto flutuante) e apresentá-los em ordem decrescente.
– supor que não sejam iguais.
 */

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;

        System.out.println("Digite um numero real");
        numero1 = entrada.nextDouble();

        System.out.println("Digite outro numero real");
        numero2 = entrada.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " , " + numero2);
        } else {
            System.out.println(numero2 + " , " + numero1);
        }
        entrada.close();



    }
    
}
