package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int year = n / 365;
        int month = n % 365 / 30;
        int weeks = n % 365 % 30;

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(weeks + " dia(s)");

        sc.close();
    }
}
