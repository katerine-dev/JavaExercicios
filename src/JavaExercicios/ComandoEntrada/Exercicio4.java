package JavaExercicios.ComandoEntrada;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo que leia três notas de um aluno:
– calcule e mostre a média aritmética do aluno.
 */

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;

        System.out.println("Digite a nota 1");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a nota 2");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a nota 3");
        nota3 = entrada.nextDouble();

        entrada.close();

        double media;
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das notas eh:");
        System.out.println(media);




    }
    
}
