package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1113 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X, Y;
        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        sc.close();
    }
}
