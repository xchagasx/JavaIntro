package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double calc1, calc2;

        if (salary <= 400.00) {
            calc1 = (salary * 15) / 100 + salary;
            calc2 = (salary * 15) / 100;
            System.out.printf("Novo salario: %.2f%n", calc1);
            System.out.printf("Reajuste ganho: %.2f%n", calc2);
            System.out.println("Em percentual: 15 %");
        } else if (salary <= 800.00) {
            calc1 = (salary * 12) / 100 + salary;
            calc2 = (salary * 12) / 100;
            System.out.printf("Novo salario: %.2f%n", calc1);
            System.out.printf("Reajuste ganho: %.2f%n", calc2);
            System.out.println("Em percentual: 12 %");
            
        } else if (salary <= 1200.00) {
            calc1 = (salary * 10) / 100 + salary;
            calc2 = (salary * 10) / 100;
            System.out.printf("Novo salario: %.2f%n", calc1);
            System.out.printf("Reajuste ganho: %.2f%n", calc2);
            System.out.println("Em percentual: 10 %");
        } else if (salary <= 2000.00) {
            calc1 = (salary * 7) / 100 + salary;
            calc2 = (salary * 7) / 100;
            System.out.printf("Novo salario: %.2f%n", calc1);
            System.out.printf("Reajuste ganho: %.2f%n", calc2);
            System.out.println("Em percentual: 7 %");

        } else {
            calc1 = (salary * 4) / 100 + salary;
            calc2 = (salary * 4) / 100;
            System.out.printf("Novo salario: %.2f%n", calc1);
            System.out.printf("Reajuste ganho: %.2f%n", calc2);
            System.out.println("Em percentual: 4 %");
        }
        sc.close();
    }
}
