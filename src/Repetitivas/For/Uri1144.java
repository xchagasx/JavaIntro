package Repetitivas.For;

import java.util.Scanner;

public class Uri1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int firstColumm = i;
            int secondCollum = (int)Math.pow(i, 2);
            int thirdCollum = (int)Math.pow(i, 3);
            System.out.println(i + " " + secondCollum + " " + thirdCollum);
            System.out.println(firstColumm + " " + (secondCollum + 1) + " " + (thirdCollum + 1));
        }

        sc.close();
    }
}
