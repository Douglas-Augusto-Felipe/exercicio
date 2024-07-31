package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
       
        System.out.println("New bank account registration:");

        System.out.println();
        System.out.print("Enter username: ");
        String name = sc.nextLine();

        System.out.println();
        System.out.print("Enter number account: ");
        int NumberAccount = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.print("is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        

        if (response == 'y') {
            System.out.println();
            System.out.print("Enter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(NumberAccount, name, initialDeposit);
        } else {
            account = new Account(NumberAccount, name);

        }
        System.out.println();
        System.out.println("Account data: " + account);

        System.out.println();
        System.out.println("Enter the deposit to be added: R$ ");
        double Deposit = sc.nextDouble();
        account.deposit(Deposit);

        System.out.println();
        System.out.println("Account data updated: " + account);

        System.out.println();
        System.out.println("Enter the deposit to be removed: R$ ");
        Deposit = sc.nextDouble();
        account.withdraw(Deposit);

        System.out.println();
        System.out.println("Account data updated: " + account);

        sc.close();
    }
}