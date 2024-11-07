package Repetitivas.For;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int n1, n2;
            int div;
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            div = n1 / n2;
            if (div == 0.0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(div);
            }
        }
        sc.close();
    }
}
