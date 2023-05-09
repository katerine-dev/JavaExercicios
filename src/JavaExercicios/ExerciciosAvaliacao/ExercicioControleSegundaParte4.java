package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir:
produto 1, US$ 2,98; produto 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87.
Escreva um aplicativo que leia uma série de pares de números como segue:
a) número de produto
b) quantidade vendida
Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto.
Você deve calcular e exibir o valor de varejo total de todos os produtos vendidos.
Utilize um loop controlado por sentinela para determinar quando o programa deve parar o loop e exibir os resultados finais.
*/

public class ExercicioControleSegundaParte4 {
    public static void main(String[] args) {
        int codigoProduto = 0;
        Scanner entrada = new Scanner(System.in);
        double valorProduto = 0.0;
        double varejoTotal = 0.0;
        int totalProdutosVendidos =0;

        System.out.println("Digite o código do produto? (ou -1 para encerrar):");
        codigoProduto = entrada.nextInt();

        while (codigoProduto != -1) {

            switch (codigoProduto) {
                case 1:
                    valorProduto = 2.98;
                    break;
                case 2:
                    valorProduto = 4.50;
                    break;
                case 3:
                    valorProduto = 9.98;
                    break;
                case 4:
                    valorProduto = 4.49;
                    break;
                case 5:
                    valorProduto = 6.87;
                    break;
                default:
                    System.out.println("Código do produto inválido!");
            }

            System.out.println("Quantos itens foram vendidos?");
            totalProdutosVendidos = entrada.nextInt();

            varejoTotal += valorProduto * totalProdutosVendidos;
            System.out.println("Valor total dos itens vendidos: " + varejoTotal);

            System.out.println("Digite o código do produto? (ou -1 para encerrar):");
            codigoProduto = entrada.nextInt();

        }

        entrada.close();
    }
}
