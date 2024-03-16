import java.util.Scanner;

public class Exercicio08 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        double num1[] = new double[5];
        double num2[] = new double[5];
        double c[] = new double[10];

        for (i = 0; i < 5; i++){

            System.out.println("Digite um numero: ");
            num1[i] = leitor.nextDouble();
            c[i] = num1[i];
        }

        for (i = 0; i < 5; i++){
            System.out.println("Digite outro numero: ");
            num2[i] = leitor.nextDouble();
            c[i + 5] = num2[i];
        }
        
        for (i = 0; i < 10; i++){
            System.out.println("Valores: " + c[i]);
        }

    }

}
