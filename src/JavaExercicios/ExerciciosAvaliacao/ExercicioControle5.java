package JavaExercicios.ExerciciosAvaliacao;
import java.util.Scanner;


/**
 * @author katerinelindawitkoski
 */

/*
Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e,
então, exibe um quadrado vazio desse tamanho com asteriscos.
Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
 */

public class ExercicioControle5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ladoQuadrado = 0;
        String mensagem = "Insira o tamanho do lado do quadrado [comprimentos entre 1 e 20]: ";


        System.out.println(mensagem);
        ladoQuadrado = entrada.nextInt();
        if (ladoQuadrado < 1 || ladoQuadrado > 20) {
            System.out.println("Tamanho de comprimento incorreto");
            System.out.println();
            System.out.print(mensagem);
            ladoQuadrado = entrada.nextInt();
        }

        char[][] quadrado = new char[ladoQuadrado][ladoQuadrado];
        for (int linha = 0; linha < ladoQuadrado; linha++) {
            for (int coluna = 0; coluna < ladoQuadrado; coluna++) {
                if (linha == 0 || linha == ladoQuadrado - 1 || coluna == 0 || coluna == ladoQuadrado - 1) {
                    quadrado[linha][coluna] = '*';
                } else {
                    quadrado[linha][coluna] = ' ';
                }
            }
            System.out.println();
            for (int i = 0; i < quadrado[linha].length; i++){
                System.out.print(quadrado[linha][i] + " ");

            }
        }
        entrada.close();

    }

}
