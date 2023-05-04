package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Ler dois valores inteiros:
– e se forem iguais, mostrar “Números iguais”;
– caso contrário, apresentar a diferença do maior pelo menor.
 */

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite um numero");
        numero1 = entrada.nextInt();

        System.out.println("Digite outro numero");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("numeros iguais");
        } else if (numero1 > numero2) {
            System.out.println(numero1);
        } else {
            System.out.println(numero2);
        }
        entrada.close();



    }
    
}
