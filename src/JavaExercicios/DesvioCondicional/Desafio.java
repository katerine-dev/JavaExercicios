package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
• Desenvolver um algoritmo para definir se uma pessoa está apta a votar no Brasil.
• Pesquise: Quais são as regras para se votar no Brasil?
– Identifique quais os dados de entrada necessários para resolver o problema.
– Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta a votar.
• Faça um programa que pede as informações necessárias e verifica se uma pessoa está apta a votar.
Solução:

- o voto é obrigatorio para >= a 18 anos e <= 70 anos e;
- precisa ter nacionalidade brasileira

*/

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a sua idade");
        int idade = entrada.nextInt();

        System.out.println("Você é brasileiro ou tem nacionalidade brasileira? (S/N)");
        String resposta = entrada.next();
        entrada.close();

        boolean idadeObrigatoria = idade >= 18 && idade <= 70;
        boolean ehBrasileiro = resposta.equals("S");

        if (idadeObrigatoria && ehBrasileiro) {
            System.out.println("Você está apto para votar!");
        }
        else  {
            System.out.println("Você não está apto para votar");
        }


    }
    
}
