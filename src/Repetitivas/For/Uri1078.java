package Repetitivas.For;

import java.util.Scanner;

public class Uri1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int acc = 0;

        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
