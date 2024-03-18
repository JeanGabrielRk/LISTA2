import java.util.Scanner;

public class Exercicio15 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");

        vetor[0] = leitor.nextInt();

        for (int i = 1; i < 5; i++) {
            int numero = leitor.nextInt();

            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Digite novamente:");
                i--; 
            }
        }

        System.out.println("Vetor preenchido de acordo com as regras:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    
    }

}
