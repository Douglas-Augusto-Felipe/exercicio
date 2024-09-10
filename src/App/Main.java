package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Person;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media, sum, alturaMenores, percentualMenores, idade;
        String names;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
        }
        sc.nextLine();

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + vect[i].getHeight();

        }
        media = sum / n;
        idade = 0;
        names = "";
        alturaMenores = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i].getAge() < 16) {
                alturaMenores++;
            }
        }
        percentualMenores = ((double) alturaMenores / n) * 100.0;

        for (int i = 0; i < n; i++) {
            idade = idade + alturaMenores;
            if (alturaMenores < 16) {
                System.out.printf("%s\n", names);
            }
        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
        System.out.printf("Altura média: %.2f", media);

        sc.close();
    }
}