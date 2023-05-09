package JavaExercicios.ExerciciosAvaliacao;

import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos
(ambos como inteiros) para cada viagem.
O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem total e a
soma total de litros de combustível consumidos até esse ponto para todas as viagens.
Todos os cálculos de média devem produzir resultados de ponto flutuante.
Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.
 */

public class ExercicioControle1 {
    public static void main(String[] args) {

        int quilometrosDirigidos = 0;
        int litrosConsumidos = 0;
        int quilometragemTotal = 0;
        int somaLitros = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a quilometragem? (ou -1 para encerrar):");
        quilometrosDirigidos = entrada.nextInt();

        while (quilometrosDirigidos != -1) {

            System.out.println("Quantidade de litros de gasolina? ");
            litrosConsumidos = entrada.nextInt();

            double consumo = (double) quilometrosDirigidos/litrosConsumidos;
            System.out.println("Km/l é igual: " + consumo);

            quilometragemTotal = quilometrosDirigidos + quilometragemTotal;
            somaLitros = litrosConsumidos + somaLitros;

            System.out.println("--------------------------");
            System.out.println("Quilometragem total: " + quilometragemTotal);
            System.out.println("Soma total de litros: " + somaLitros);

            System.out.println("Qual é a quilometragem? (ou -1 para encerrar):");
            quilometrosDirigidos = entrada.nextInt();

        }

        entrada.close();


    }

}
