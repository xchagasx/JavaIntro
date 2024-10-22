package Repetitivas.For;

import java.util.Locale;
import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int number;
        for (int i = 0; i < x; i++) {
            if (x % 2 == 0) { // CASO O NÚMERO SEJA PAR
                number = x - (x - 1); // SUBTRAIR POR 1
                System.out.println(number);
            } else if (x % 2 != 0) { // CASO O NÚMERO SEJA ÍMPAR
                number = x; // MANTENHA
                System.out.println(number);
            }
        }
        sc.close();
    }
}
