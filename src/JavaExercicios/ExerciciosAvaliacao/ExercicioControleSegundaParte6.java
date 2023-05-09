package JavaExercicios.ExerciciosAvaliacao;

/**
 * @author katerinelindawitkoski
 */

/*
Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros.
O conjunto de três valores inteiros para os comprimentos dos lados de um triângulo retângulo é chamado
de triplo de Pitágoras.
Os comprimentos dos três lados devem satisfazer a
relação de que a soma dos quadrados de dois dos lados é igual ao quadrado da hipotenusa.
Escreva um aplicativo para exibir uma tabela dos triplos de Pitágoras para side1, side2 e hypotenuse, todos não maiores que 500.
Utilize um loop for triplamente aninhado que tenta todas as possibilidades. Esse é um método de computação de “força bruta”.
Você aprenderá nos cursos de ciência da computação mais avançados que para muitos problemas interessantes não
há uma abordagem algorítmica conhecida além do uso de força bruta absoluta.
*/

public class ExercicioControleSegundaParte6 {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int hipotenusa;

        for (hipotenusa = 1; hipotenusa <= 500; hipotenusa++) { // enunciado pede para ser maior de 500
            for (lado1 = 1; lado1 <= 500; lado1++) {
                for (lado2 = 1; lado2 <= 500; lado2++) {
                    if (lado1 * lado1 + lado2 * lado2 == hipotenusa * hipotenusa) { //O quadrado da hipotenusa é igual a soma dos quadrados dos catetos.
                        System.out.println(lado1 + " " + lado2 + " " + hipotenusa);
                    }
                }
            }
        }
    }
}
