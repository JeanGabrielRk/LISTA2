import java.util.Scanner;

public class Exercicio09 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorB[i] = leitor.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                vetorC[i] = vetorA[i];
            } else { 
                vetorC[i] = vetorB[i];
            }
        }

        System.out.println("\nO vetor C gerado é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }
}
