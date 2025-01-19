package Repetitivas.For;

import java.util.Scanner;

public class Uri1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                if (i % n == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            n = sc.nextInt();
        }
        sc.close();
    }
}
