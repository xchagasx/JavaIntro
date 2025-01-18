package Repetitivas.For;

import java.util.Scanner;

public class Uri1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int som = 1;

        for (int i = 1; i <= n; i++) {
            int add = som + 1;
            int incl = som + 2;
            System.out.println(som + " " + add + " " + incl + " PUM");
            som = som + 4;
        }

        sc.close();
    }
}
