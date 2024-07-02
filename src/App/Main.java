package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.rectangle;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp.name + ", $ " + emp.netSalary());
        System.out.println("Which percentage to increasy salary? ");
        double percentage = sc.nextDouble();
        emp.increasySalary(percentage);

        System.out.println("Updated data: " + emp);

        sc.close();
    }
}