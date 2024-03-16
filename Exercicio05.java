import java.util.Scanner;

public class Exercicio05 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        int n;
        double numeros[] = new double[5];

        for (i = 0; i < 5; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = leitor.nextDouble();
        }

        System.out.println("Informe um valor para n: ");
        n = leitor.nextInt();

        int cont = 0;
        for (i = 0; i < 5; i++){

            if (n == numeros[i]){
                cont = cont + 1;
            }
        }

        System.out.println("Valor digitado aparece: " + cont);
        
    }

}
