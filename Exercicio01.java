import java.util.Scanner;

public class Exercicio01 {

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

        for (i = 0; i < 5; i++){
            if (numeros[i] > media){
                System.out.println("Maior: " + numeros[i]);
            }
            else if (numeros[i] < media){
                System.out.println("Menor: " + numeros[i]);
            }
            if (numeros[i] == media){
                System.out.println("Igual: " + numeros[i]);
            }
        }
        
    }

}
