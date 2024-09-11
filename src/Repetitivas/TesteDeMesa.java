package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class TesteDeMesa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        while (x < 3) {
            y = y + 2;
            x = x + 1;
            System.out.println(x + " - " + y);
        }

        sc.close();
    }
}
