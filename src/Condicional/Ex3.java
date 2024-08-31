package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        if (min <= 100) {
            System.out.println("Valor a pagar: R$ 50.00");
        } else {
            double sumMin = ((min - 100) * 2) + 50;
            System.out.printf("Valor a pagar: R$ %.2f%n", sumMin);
        }

        sc.close();
    }
}
