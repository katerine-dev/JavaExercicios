package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
• Faça um algoritmo que verifique a validade de uma senha fornecida pelo usuário.
– sabendo que a senha é R10p5:
 ̈ imprimir mensagem de “acesso concedido” ou “acesso negado”.
• Para comparar duas Strings utilizar o método equals();
– ele retorna um valor booleano!
– Exemplo:
 ̈ if(senha.equals("R10p5"))
 */

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String senhaDigitada = entrada.next();

        if (senhaDigitada.equals("R10p5")) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }

        entrada.close();


    }
    
}
