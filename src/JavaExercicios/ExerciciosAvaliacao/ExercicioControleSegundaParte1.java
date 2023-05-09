package JavaExercicios.ExerciciosAvaliacao;

/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que calcula o produto dos números inteiros
ímpares de 1 a 15.

 */


public class ExercicioControleSegundaParte1 {
    public static void main(String[] args) {
        int produtoImpares = 1; // é inicializado por 1 pq se o valor for igual a 0 o produto será sempre 0.

        for(int i = 1; i < 16; i++){
            if (i % 2 != 0) {
                produtoImpares = produtoImpares * i;  // *=

                System.out.println( "O produto dos números impares é " + produtoImpares);
            }
        }
    }
}
