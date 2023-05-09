package JavaExercicios.ExerciciosAvaliacao;

/**
 * @author katerinelindawitkoski
 */

/*
 Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito como n! e pronunciado como “fatorial de n”)
 é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo long.
 Exiba os resultados em formato tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?
 Porque a saída seria muito maior que um long poderia armazenar. 

*/

public class ExercicioControleSegundaParte2 {
    public static void main(String[] args) {

        for(int i = 1; i < 20; i++){ // para cada número
            long numFatorial = 1; // precisa ser declarado no for
            for (int k = 1; k <= i; k++){
                numFatorial = numFatorial * k;
            }
            System.out.println("Fatorial de " + i +" = " + numFatorial);
        }
    }
}
