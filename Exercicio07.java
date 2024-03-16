import java.util.Scanner;

public class Exercicio07 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        double num1[] = new double[5];
        double num2[] = new double[5];

        for (i = 0; i < 5; i++){

            System.out.println("Digite um numero: ");
            num1[i] = leitor.nextDouble();
        }

        for (i = 0; i < 5; i++){
            System.out.println("Digite outro numero: ");
            num2[i] = leitor.nextDouble();
        }
        
        for (i = 0; i < 5; i++){
            if (num1[i] == num2[i]){
                System.out.println("Os vetores são iguais");
                break;
            }
            else {
                System.out.println("Os vetores não são iguais");
                break;
            }
        }

    }

}
