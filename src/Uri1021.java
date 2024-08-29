import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        double calc100 = (int) n / 100;
        double calc50 = (n % 100) / 50;
        double calc20 = (n % 50) / 20;
        double calc10 = (n % 10) / 10;
        double calc5 = (n % 10) / 5;
        double calc2 = (n % 5) / 2;
        double calc1 = Math.abs(2 - (n % 5));

        System.out.println("NOTAS:");
        System.out.printf("%.0f%n", calc100, " nota(s) de R$ 100,00");
        System.out.printf("%.0f%n", calc50, " nota(s) de R$ 50,00");
        System.out.printf("%.0f%n", calc20, " nota(s) de R$ 20,00");
        System.out.printf("%.0f%n", calc10, " nota(s) de R$ 10,00");
        System.out.printf("%.0f%n", calc5, " nota(s) de R$ 5,00");
        System.out.printf("%.0f%n", calc2, " nota(s) de R$ 2,00");
        System.out.printf("%.0f%n", calc1, " nota(s) de R$ 1,00");

        sc.close();
    }
}
