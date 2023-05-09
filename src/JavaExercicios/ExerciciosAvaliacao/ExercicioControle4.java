package JavaExercicios.ExerciciosAvaliacao;



/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:

N	10*N	100*N	1000*N
1	10	     100	1000
2	20	     200	2000
3	30	     300	3000
4	40	     400	4000
5	50	     500	5000

 */

public class ExercicioControle4 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][4];

        System.out.print("N " + "10*N " + "100*N " + "1000*N ");
        System.out.println();

        for(int i = 0; i < 5; i++){ // 5 quantidade de linhas
            matriz[i][0] = i + 1;
            matriz[i][1] =  (i + 1) * 10;
            matriz[i][2] = (i + 1) * 100;
            matriz[i][3] = (i + 1) * 1000;
            for (int k = 0; k < matriz[i].length; k++){
                System.out.print(matriz[i][k] + " ");
            }
            System.out.println();
        }

    }

}
