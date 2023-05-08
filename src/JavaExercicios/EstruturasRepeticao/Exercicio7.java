package JavaExercicios.EstruturasRepeticao;
import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */

/*
O IMC (índice de Massa Corporal) é uma medida do grau de obesidade de uma pessoa.
– Faça um algoritmo que leia a altura e o peso de 10 pessoas.
– Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre
18,5 e 24,9 que é considerado sem obesidade.
*/

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int contadorSemObesidade = 0;
        double peso;
        double altura;
        double imc;

        while (contador <= 5) {
            System.out.println("Digite o seu peso");
            peso = entrada.nextDouble();
            System.out.println("Digite a sua altura");
            altura = entrada.nextDouble();
            imc = peso / (altura * altura);
            if (imc >= 18.5 && imc <= 24.9) {
                contadorSemObesidade++;
            }
            contador++;
        }

        System.out.println("O numero de pessoas sem obesidade eh: " + contadorSemObesidade);

        entrada.close();
    }
    
}
