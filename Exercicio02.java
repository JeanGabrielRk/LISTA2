import java.util.Scanner;

public class Exercicio02 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        double numeros[] = new double[5];

        for (i = 0; i < 5; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = leitor.nextDouble();
        }

        for (i = 0; i < 5; i++){

            if (numeros[i] > 0){
                System.out.println("O numero eh positivo na posicao: " + i);
            }
            else if (numeros[i] < 0){
                System.out.println("O numero eh negativo na posicao: " + i);
            }
            else if (numeros[i] == 0){
                System.out.println("O numero eh igual a zero na posicao: " + i);
            }
        }
        
    }

}
