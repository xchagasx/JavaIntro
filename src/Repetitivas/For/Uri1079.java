package Repetitivas.For;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double n1 = sc.nextDouble();
            double calc1 = n1 * 2;

            double n2 = sc.nextDouble();
            double calc2 = n2 * 3;

            double n3 = sc.nextDouble();
            double calc3 = n3 * 5;

            double calcFinal = (calc1 + calc2 + calc3) / (2 + 3 + 5);
            System.out.printf("%.1f%n", calcFinal);
        }

        sc.close();
    }
}
