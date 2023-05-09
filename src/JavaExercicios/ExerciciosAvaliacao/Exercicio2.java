package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e
exiba o número maior seguido pelas palavras “É maior".
Se os números forem iguais, imprima a mensagem “Estes números são iguais"
 */

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inteiro1 = 0;
        int inteiro2 = 0;

        System.out.println("Digite o primeiro inteiro");
        inteiro1 = entrada.nextInt();
        System.out.println("Digite o segundo inteiro");
        inteiro2 = entrada.nextInt();
        entrada.close();

        // Maior número
        if (inteiro1 > inteiro2) {
            System.out.println(inteiro1 + " é o maior número");
        } else if (inteiro2 > inteiro1){
            System.out.println(inteiro2 + " é o maior número");
        } else { // números iguais
            System.out.println("Estes números são iguais");
        }


    }
    
}
