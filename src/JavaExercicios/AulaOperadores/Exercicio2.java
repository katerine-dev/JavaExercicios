package JavaExercicios.AulaOperadores;
import java.util.Scanner;
/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo para imprimir em cada linha:
– a sua idade;
– a sua altura;
– o seu status na aula:
    - "o" para online
    - "f" para offline
 */

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        char status;

        System.out.println("Digite o seu nome");
        nome = entrada.next();
        System.out.println("Digite a sua idade");
        idade = entrada.nextInt();
        System.out.println("Digite o seu status");
        status = entrada.next().charAt(0);

        entrada.close();


        System.out.println("Imprimindo informacoes");
        System.out.println(nome + " " + idade + " " + status);


    }
    
}
