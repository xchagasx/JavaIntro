package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codA;
        double quantA;
        double valueA;
        codA = sc.nextInt();
        quantA = sc.nextDouble();
        valueA = sc.nextDouble();

        int codB;
        double quantB;
        double valueB;
        codB = sc.nextInt();
        quantB = sc.nextDouble();
        valueB = sc.nextDouble();

        double calc = quantA * valueA + quantB * valueB;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", calc);
        sc.close();
    }
}
