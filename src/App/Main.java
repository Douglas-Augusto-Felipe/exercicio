package App;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, qntpares;

        System.out.print("Quantos numeros voce vai digitar? ");

        n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        qntpares = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("%d ", numbers[i]);
                qntpares++;
            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n " , qntpares);

        sc.close();
    }
}