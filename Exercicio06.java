import java.util.Scanner;

public class Exercicio06 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int i;
        double notas[] = new double[5];
        double pesos[] = new double[5];
        double soma = 0;
        double peso = 0;

        for (i = 0; i < 5; i++){

            System.out.println("Digite uma nota: ");
            notas[i] = leitor.nextDouble();
        }

        for (i = 0; i < 5; i++){
            System.out.println("Digite um peso: ");
            pesos[i] = leitor.nextDouble();
        }
        
        for (i = 0; i < 5; i++){
            soma = notas[i] * pesos[i];
            peso = pesos[i] + pesos[i];
        }

        double media = soma / peso;

        System.out.println("Media ponderada: " + media);

    }

}
