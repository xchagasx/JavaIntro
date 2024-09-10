package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double renda = sc.nextDouble();

        if(renda >= 0.00 && renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda >= 2000.01 && renda <= 3000.00) {
            double calc = ((renda - 2000) * 8) / 100;
            System.out.printf("R$ %.2f%n", calc);
        } else if (renda >= 3000.01 && renda <= 4500.00) {
            double calc = ((((renda - 3000) + 1000) * 18) / 100) - 100;
            System.out.printf("R$ %.2f%n", calc);
        } else if (renda > 4500.00) {
            double calc = ((((renda - 3000) + 1000) * 18) / 100) - 100;
            System.out.printf("R$ %.2f%n", calc);
        }

        sc.close();
    }
}
