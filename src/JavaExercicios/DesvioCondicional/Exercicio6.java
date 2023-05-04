package JavaExercicios.DesvioCondicional;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia a altura e o sexo de uma pessoa:
– calcule e mostre seu peso ideal.
– usar as formulas a seguir para calcular o peso ideal:
 ̈ para o sexo masculino: (72, 7 x altura)  - 58
 ̈ para o sexo feminino (62,1xaltura) - 44,7
 */

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura");
        double altura = entrada.nextDouble();

        System.out.println("Digite o seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("Peso ideal");

        double peso;
        if (sexo == 'M') {
            peso = (72.7 * altura) - 58;
            System.out.println(peso);
        }

        if (sexo == 'F') {
            peso = (62.1 * altura) - 44.7;
            System.out.println(peso);
        }
        entrada.close();


    }
    
}
