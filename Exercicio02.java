import java.util.Scanner;

public class Exercicio02 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        double numeros[] = new double[5];
        double soma = 0;
        double media;

        for (i = 0; i < 5; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = leitor.nextDouble();

            soma = soma + numeros[i];
        }

        media = soma / 5;

        System.out.println("A media eh: " + media);
        
    }

}
