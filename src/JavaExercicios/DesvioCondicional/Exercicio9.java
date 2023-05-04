package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
• A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatuários.
– o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
– fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o
empréstimo pode ou não ser concedido.
• Exemplo:
– Salário bruto: 1200,00
– Valor da prestação: 400,00
– Empréstimo não pode ser concedido!
 */

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do salário bruto");
        double salario = entrada.nextDouble();
        double prestacaoMaxima = salario * 0.3;

        System.out.println("Digite o valor da prestação");
        double prestacao = entrada.nextDouble();

        if (prestacao > prestacaoMaxima) {
            System.out.println("Empréstimo não pode ser concedido");
        } else {
            System.out.println("Salário pode ser concedido");
        }

        entrada.close();


    }
    
}
