package Repetitivas.For;

import java.util.Scanner;

public class Uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            for (int i = n; i <= m; i++) {
                sum = sum + i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + sum);
            m = sc.nextInt();
            n = sc.nextInt();
            sum = 0;
        }

        sc.close();
    }
}
