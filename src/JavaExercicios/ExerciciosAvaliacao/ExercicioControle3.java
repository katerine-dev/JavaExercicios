package JavaExercicios.ExerciciosAvaliacao;

import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados.
A empresa paga as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as
horas trabalhadas além das 40 horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na
semana passada e o salário-hora de cada um.
Seu programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados.

 */

public class ExercicioControle3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTrabalhadas = 0;
        double salarioHora = 0.0;
        String empregado = "";

        for(int i = 0; i < 3; i++){ // para cada três empregados
            System.out.println("Qual é o seu nome? ");
            empregado = entrada.next();

            System.out.println("Quantas horas trabalhadas você completou? ");
            horasTrabalhadas = entrada.nextInt();

            System.out.println("Qual é o seu salário-hora? ");
            salarioHora = entrada.nextDouble();

            double salarioBruto = 0.0;

            if (horasTrabalhadas <= 40){
                salarioBruto = salarioHora * horasTrabalhadas;
                System.out.println("Seu salário bruto é " + salarioBruto);
            }else {
                int horasExtras = horasTrabalhadas - 40;
                salarioBruto =  (salarioHora * horasTrabalhadas) + (horasExtras + 1.5); // 1.5 = 50%
                System.out.println("Seu salário bruto é " + salarioBruto);
            }

        }

    }

}
