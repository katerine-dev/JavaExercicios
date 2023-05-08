package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros
por três espaços. Por exemplo, se o usuário digitar o número 42339, o programa deve imprimir

4	2	3	3	9

Suponha que o usuário insira o número correto de dígitos.
O que acontece quando você insere um número com mais de cinco dígitos?
Na minha implementação o número a mais é ignorado.
Por exemplo:
Digite um inteiro com 5 dígitos:
123456
1   2   3   4   5
O que acontece quando você insere um número com menos de cinco dígitos?
Ele "quebra" me informando que o meu índice está fora dos limites para comprimento.
[Dica: você precisará tanto das operações de divisão como das de resto para “selecionar” cada dígito.]
 */

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String numero = "";

        System.out.println("Digite um inteiro com 5 dígitos: ");
        numero = entrada.next();
        char[] digitos = numero.toCharArray(); // ela pega um String e devolve um vetor de characteres

        for (int i = 0; i < 5; i++){ // posso usar < 5
            System.out.print(digitos[i]);
            System.out.print("   ");
        }

        entrada.close();

    }
    
}
