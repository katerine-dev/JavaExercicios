package JavaExercicios.EstruturasRepeticao;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia dez números inteiros e mostre o menor entre eles.
*/

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 0;
        int menorValor = 0;

        while (contador < 10) {
            System.out.println("Digite um numero");
            numero = entrada.nextInt();

            if (contador == 0) {
                menorValor = numero;
            }

            if (menorValor > numero) {
                menorValor = numero;
            }
            contador++;
        }
        System.out.println("menor numero: " + menorValor);

        entrada.close();
    }
    
}
