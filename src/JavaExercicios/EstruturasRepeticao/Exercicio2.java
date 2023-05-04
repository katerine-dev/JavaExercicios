package JavaExercicios.EstruturasRepeticao;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia 10 números inteiros e diga:
– quantos são pares;
– e quantos são ímpares.
*/

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int numero;
        int pares = 0;
        int impares = 0;

        while (contador < 10) {
            System.out.println("Digite um numero");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contador++;
        }
        System.out.println("O total de pares eh: " + pares);
        System.out.println("O total de impares eh: " + impares);

        entrada.close();
    }
    
}
