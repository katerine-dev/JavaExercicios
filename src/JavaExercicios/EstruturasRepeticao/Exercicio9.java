package JavaExercicios.EstruturasRepeticao;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia o código do produto e a quantidade que o cliente deseja comprar.
– O cliente pode comprar mais de um produto, pergunte se ele deseja continuar comprando.
– Calcule o valor total a ser pago por cada produto e o valor total da compra.
*/

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char resposta = 's';
        int codigoProduto;
        int quantidade;
        double totalPagar = 0;

        do {

            System.out.println("Digite o codigo do produto");
            codigoProduto = entrada.nextInt();
            System.out.println("Digite a quantidade de produto");
            quantidade = entrada.nextInt();

            switch (codigoProduto) {
                case 100:
                    totalPagar = totalPagar + (1.2 * quantidade);
                    System.out.println("Total a pagar por cachorro quente:");
                    System.out.println(1.2 * quantidade);
                    break;

                case 101:
                    totalPagar = totalPagar + (1.3 * quantidade);
                    System.out.println("Total a pagar por bauru simples:");
                    System.out.println(1.3 + quantidade);
                    break;

                case 102:
                    totalPagar = totalPagar + (1.5 * quantidade);
                    System.out.println("Total a pagar por bauru com ovo");
                    System.out.println(1.5 * quantidade);
                    break;

                case 103:
                    totalPagar = totalPagar + (1.2 * quantidade);
                    System.out.println("Total a pagar por hamburguer");
                    System.out.println(1.2 * quantidade);
                    break;

                case 104:
                    totalPagar = totalPagar + (1.3 * quantidade);
                    System.out.println("Total a pagar por cheeseburguer");
                    System.out.println(1.3 * quantidade);
                    break;

                case 105:
                    totalPagar = totalPagar + (1 * quantidade);
                    System.out.println("Total a pagar por refrigerante");
                    System.out.println(1 * quantidade);
                    break;

                default:
                    System.out.println("Opcao invalida: " + codigoProduto);
            }

            System.out.println("Deseja continuar? s/n");
            resposta = entrada.next().charAt(0);

        } while (resposta == 's');
        System.out.println("Total a pagar");
        System.out.println(totalPagar);

        entrada.close();
    }
    
}
