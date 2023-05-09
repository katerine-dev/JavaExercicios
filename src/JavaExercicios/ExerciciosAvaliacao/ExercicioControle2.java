package JavaExercicios.ExerciciosAvaliacao;

import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas recebe R$ 200 por semana mais 9%
de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de vendas
de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650.
Foi-lhe fornecida uma lista dos itens vendidos por cada vendedor. Os valores desses itens são como segue:

Item	Valor
1	239.99
2	129.75
3	99.95
4	350.89

Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula
e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.
 */

public class ExercicioControle2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nItens = 0;
        double salarioSemana = 200.0;
        int somaItens = 0;

        System.out.println("Quantos itens você vendeu na última semana? ");
        nItens = entrada.nextInt();

        double[] valoresItens = new double[nItens];

        for(int i = 0; i < valoresItens.length; i++){
            System.out.println("Qual o valor do item? ");
            valoresItens[i] = entrada.nextDouble();
            somaItens += valoresItens[i];
        }

        double redimento = ((0.09 * somaItens)+ salarioSemana);

        System.out.println("O seu rendimento é " + redimento);


    }

}
