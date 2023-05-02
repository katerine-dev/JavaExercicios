package JavaExercicios.AulaOperadores;

/**
 * @author katerinelindawitkoski
 */

/*
Faça um algoritmo para imprimir em cada linha o resultado
lógico da seguinte  expressão:
– ((120 - 30) = (3 x 30))
 */

public class Exercicio3 {
    public static void main(String[] args) {

        int operacao1 = (120 - 30);
        int operacao2 = (3 * 30);
        int resultado = 0;

        resultado = (operacao1 = operacao2);

        System.out.println(resultado);


    }
    
}
