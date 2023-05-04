package JavaExercicios.EstruturasRepeticao;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que imprima a tabuada do 5.
*/

public class Exercicio5 {
    public static void main(String[] args) {

        int contador = 0;

        System.out.println("Tabuada do 5");
        while (contador < 11) {
            System.out.println("5 x " + contador + " = " + contador * 5);
            contador++;
        }
    }
    
}
