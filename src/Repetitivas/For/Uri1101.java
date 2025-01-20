package Repetitivas.For;

import java.util.Scanner;

public class Uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int sum = 0;

        do {
            for (int i = n; i <= m; i++) {
                sum = sum + i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + sum);
            sum = 0;
            m = sc.nextInt();
            n = sc.nextInt();
        } while (n != 0 && n > 0);

        sc.close();
    }
}
