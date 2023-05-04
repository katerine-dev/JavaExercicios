package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo para ler um número inteiro.
– verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive);
– se estiver:
 ̈ imprimir “Pertence ao intervalo”;
– senão:
 ̈ imprimir “Não pertence ao intervalo”
 */

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número");
        numero = entrada.nextInt();

        if (numero >= 50 && numero <= 100) {

            System.out.println("pertence ao intervalo");
        } else {
            System.out.println("nao pertece ao intervalo");
        }

        entrada.close();


    }
    
}
