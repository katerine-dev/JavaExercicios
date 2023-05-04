package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Criar uma calculadora de operações básicas:
– soma, subtração, multiplicação e divisão.
– o algoritmo deve ler dois números e o sinal correspondente à operação desejada; – utilize o tipo char para ler a operação;
– no final deve ser impresso o resultado.
• Restrições:
– seosinaldigitadonãocorresponderaumaoperação...
 ̈ apresentar a mensagem Sinal Inválido e finalizar.
– para a operação de divisão verificar se o divisor é válido (maior que zero)!  ̈ caso seja menor ou igual a zero, informar a mensagem “Impossível dividir!!”

 */

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        int n2 = entrada.nextInt();

        System.out.println("Digite a operação");
        char operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            System.out.println(n1 + n2);
        }

        else if (operacao == '-') {
            System.out.println(n1 - n2);
        }

        else if (operacao == '*') {
            System.out.println(n1 * n2);
        }

        else if (operacao == '/') {
            if (n2 == 0) {
                System.out.println("impossível dividir");
            }

            else {
                System.out.println(n1 / n2);
            }
        }

        else {
            System.out.println("Sinal inválido");
        }

        entrada.close();


    }
    
}
