package App;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        CurrencyConverter.dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.quantityInDollars = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.Calculator());

        sc.close();
    }
}