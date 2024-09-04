package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (n >= 0 && n <= 25.00) {
            System.out.printf("Intervalo [0,25]");
        } else if (n >= 25.01 && n <= 50.00) {
            System.out.printf("Intervalo (25,50]");
        } else if (n >= 50.01 && n <= 75.00) {
            System.out.printf("Intervalo [50,75]");
        } else if (n >= 75.01 && n <= 100.00) {
            System.out.printf("Intervalo (75,100]");
        } else if (n < 0.00 || n >= 100.01) {
            System.out.printf("Fora de intervalo");
        }
        sc.close();
    }
}
