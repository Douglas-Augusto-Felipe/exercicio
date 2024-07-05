package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Employee;
import entities.rectangle;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Name: ");
        aluno.Nome = sc.nextLine();
        System.out.print("Grade1: ");
        aluno.Nota1 = sc.nextDouble();
        System.out.print("Grade2: ");
        aluno.Nota2 = sc.nextDouble();
        System.out.print("Grade3: ");
        aluno.Nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.FinalGrade());

        if (aluno.FinalGrade() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing Grade: %,2f", aluno.MissingGrade());
        } else {
            System.out.println("Pass");
        }
        sc.close();
    }
}