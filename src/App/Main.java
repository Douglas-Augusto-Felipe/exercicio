package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum, media;

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + vect[i];
        }
        media = sum / n;

        System.out.println("VALORES = ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f " , vect[i]);
        }
        System.out.printf("\nSOMA = %.2f\n", sum);

        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}