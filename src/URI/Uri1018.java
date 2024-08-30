package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int calc100 = n / 100;
        int calc50 = (n % 100) / 50;
        int calc20 = (n % 50) / 20;
        int calc10 = (n % 10) / 10;
        int calc5 = (n % 10) / 5;
        int calc2 = (n % 5) / 2;
        int calc1 = Math.abs(2 - (n % 5));

        System.out.println(n);
        System.out.println(calc100 + " nota(s) de R$ 100,00");
        System.out.println(calc50 + " nota(s) de R$ 50,00");
        System.out.println(calc20 + " nota(s) de R$ 20,00");
        System.out.println(calc10 + " nota(s) de R$ 10,00");
        System.out.println(calc5 + " nota(s) de R$ 5,00");
        System.out.println(calc2 + " nota(s) de R$ 2,00");
        System.out.println(calc1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
