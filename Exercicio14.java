import java.util.Scanner;

public class Exercicio14 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int vetor[] = new int[5];
        int i;
        int maior = 0;
        int aux1, aux2 = 0;

        for (i = 0; i < 5; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }

        for (i = 0; i < 5; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                aux2 = i;
            }
        }

        aux1 = vetor[4];
        vetor[4] = maior;
        vetor[aux2] = aux1; 
       

        for (i = 0; i < 5; i++){
            System.out.println("Vetor: " + vetor[i]);
        }
    }
}