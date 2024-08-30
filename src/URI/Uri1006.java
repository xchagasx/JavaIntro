package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();
        int pesos = 2 + 3 + 5;

        double calc = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / pesos;

        System.out.printf("MEDIA = %.1f%n", calc);

        sc.close();
    }
}
