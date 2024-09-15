package App;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, posmaior;
        double maior;

        System.out.print("Quantos numeros voce vai digitar? ");

        n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        maior = numbers[0];
        posmaior = 0;

        System.out.println("\nNUMEROS PARES:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
                posmaior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        sc.close();
    }
}