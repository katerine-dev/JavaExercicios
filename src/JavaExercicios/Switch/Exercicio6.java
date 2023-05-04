package JavaExercicios.Switch;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que:
– leia o código do produto e a quantidade; – calcule o valor a ser pago pelo cliente; – imprimir o valor a ser pago;
– imprimir o nome do produto.
*/

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Código -- Produto -- Preco");
        System.out.println("100 -- Cachorro Quente -- R$ 1,20");
        System.out.println("101 -- Bauru Simples -- R$ 1,30 ");
        System.out.println("102 -- Bauru com ovo -- R$ 1,50");
        System.out.println("103 -- Hamburguer -- R$ 1,20");
        System.out.println("104 -- Cheeseburguer -- R$ 1,30");
        System.out.println("105 -- Refrigerante -- R$ 1,00");

        System.out.println("\nDigite o código do produdo\n");
        int codigo = entrada.nextInt();

        System.out.println("Digite a quantidade do produto");
        int quantidade = entrada.nextInt();

        switch (codigo) {
            case 100:
                System.out.println("Cachorro Quente");
                System.out.println("Total a pagar: R$" + (1.2 * quantidade));
                break;

            case 101:
                System.out.println("Cachorro Quente");
                System.out.println("Total a pagar: R$" + (1.3 * quantidade));
                break;

            case 102:
                System.out.println("Cachorro Quente");
                System.out.println("Total a pagar: R$" + (1.5 * quantidade));
                break;

            case 103:
                System.out.println("Cachorro Quente");
                System.out.println("Total a pagar: R$" + (1.2 * quantidade));
                break;

            case 104:
                System.out.println("Cachorro Quente");
                System.out.println("Total a pagar: R$" + (1.3 * quantidade));
                break;

            case 105:
                System.out.println("Cachorro Quente");
                System.out.println("Total a pagar: R$" + (1.0 * quantidade));
                break;

            default:
                System.out.println("Código inválido");
        }

        entrada.close();
    }
    
}
