package JavaExercicios.Vetores;
import java.util.Scanner;


/**
 * @author Katerine Linda Witkoski - RA: 12523131635
 */
// Escolhi o nome do arquivo como Katerine e RA, pois a IDE não permitiu refactorar com apenas números:
public class Katerine12523131635 {
    public static void sequenciaInteiros() {
        int comprimento = 0; // declaração de inteiro
        Scanner entrada = new Scanner(System.in); // imput de informações

        // Como o enunciado não passou o comprimento do array podemos pedir para o usuário indicar:
        // Usando comando de entrada:

        System.out.println("Qual é o comprimento do array?");
        comprimento = entrada.nextInt(); // armazenando o tamanho do array

        int[] valores = new int[comprimento]; // indicando o tamanho do array



        for (int i = 0; i < valores.length; i++) { //Escolhi usar o método .length para usar qualquer comprimento
            System.out.println("Digite um valor");
            valores[i] = entrada.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println("valor: " + valores[i]);
        }
        entrada.close();
    }
    public static void sequenciaInteirosComRA() {

        // Usando os números do meu RA: ( para usar essa parte descomente )

        int[] valores = {1,2,5,2,3,1,3,1,6,3,5};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("valor: " + valores[i]);
        }

    }
    public static void main(String[] args) {
        System.out.println();
        sequenciaInteiros();
        System.out.println();
        System.out.println("*** Indicando com o RA ***");
        sequenciaInteirosComRA();
    }

}
