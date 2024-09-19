package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1159 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int acc = 0;
        int index = 0;
        int calc;

        while (x > 0) {
            if (x % 2 == 0) {
                x = sc.nextInt();
            } else if (x % 2 != 0) {
                x = sc.nextInt();
            }
        }

        sc.close();
    }
}
