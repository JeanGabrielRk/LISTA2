import java.util.Scanner;

public class Exercicio12 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        int vetor[] = new int[12];
        int mult = 0;

        for (i = 0; i < 12; i++){
            System.out.println("Informe um valor: ");
            vetor[i] = leitor.nextInt();
        }

        for (i = 0; i < 12; i++){
            if (vetor[i] % 2 == 0){
                mult = vetor[i] * mult;
            }
        }

        System.out.println("A multiplicação total eh: " + mult);
    }

}
