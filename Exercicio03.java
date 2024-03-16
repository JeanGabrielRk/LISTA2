import java.util.Scanner;

public class Exercicio03 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        double numeros[] = new double[5];
        double dobro[] = new double[5];

        for (i = 0; i < 5; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = leitor.nextDouble();
        }

        for (i = 0; i < 5; i++){

            dobro[i] = numeros[i] * 2;
            System.out.println("O dobro eh: " + dobro[i]);
        }
        
    }

}
