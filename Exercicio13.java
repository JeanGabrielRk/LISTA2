import java.util.Scanner;

public class Exercicio13 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci desejados: ");
        int n = leitor.nextInt();
        
        int[] fibonacci = calcularFibonacci(n);
        
        System.out.print("Sequência de Fibonacci com " + n + " termos: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] calcularFibonacci(int n) {
        int[] fibonacci = new int[n];
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

}
