import java.util.Scanner;

public class Exercicio10 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        int vetor[] = new int[5];
        int vetorB[] = new int[5];

        for (i = 0; i < 5; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }

        for (i = 0; i < 5; i++){
            vetorB[i] = vetor[4 - i];
            System.out.println("Valor: " + vetorB[i]);
        }

    }

}
