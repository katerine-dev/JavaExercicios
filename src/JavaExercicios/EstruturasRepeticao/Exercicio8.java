package JavaExercicios.EstruturasRepeticao;


/**
 * @author katerinelindawitkoski
 */

/*
Faça um programa que:
– Calcule a média aritmética de 5 alunos; – Calcule a média da classe.
• Cada aluno possui duas notas - (n1 e n2);
– A entrada de cada nota deve ser validada!
 ̈ ou seja, o programa somente avança se a entrada de nota estiver entre 0 e 10.
 ̈ caso contrário, solicite ela novamente.
*/

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        double mediaAluno;
        double mediaClasse = 0;
        double n1;
        double n2;

        while (contador <= 5) {

            do {
                System.out.println("Digite a sua nota n1: 0 - 10");
                n1 = entrada.nextDouble();
            } while (n1 <= 0 || n1 >= 10);

            do {
                System.out.println("Digite a sua nota n2: 0 - 10");
                n2 = entrada.nextDouble();
            } while (n2 <= 0 && n2 >= 10);

            mediaAluno = (n1 + n2) / 2;
            System.out.println("Sua media eh: ");
            System.out.println(mediaAluno);

            mediaClasse = mediaClasse + mediaAluno;

            contador++;

        }

        System.out.println("Media da classe:");
        System.out.println(mediaClasse / 5);

        entrada.close();
    }
    
}
