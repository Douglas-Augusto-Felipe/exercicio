package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.err.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0;i < n; i++) {
            if (vect[i]< 0) {
                System.out.printf("%d\n", vect[i]);
                
            }
        }
        sc.close();
    }
}