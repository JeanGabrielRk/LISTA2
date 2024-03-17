import java.util.Scanner;

public class Exercicio11 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        int vetor[] = new int[5];
        int vetorB[] = new int[5];
        int vetorC[] = new int[5];
        int soma = 0;

        for (i = 0; i < 5; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }

        for (i = 0; i < 5; i++){
            System.out.println("Digite outro numero: ");
            vetorB[i] = leitor.nextInt();
        }

        for (i = 0; i < 5; i++){
            vetorC[i] = vetor[i] * vetorB[i];
        }

        for (i = 0; i < 5; i++){
            soma = soma + vetorC[i];
        }

        System.out.println("A soma eh de: " + soma);  

    }

}
