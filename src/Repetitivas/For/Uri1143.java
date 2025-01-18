package Repetitivas.For;

import java.util.Scanner;

public class Uri1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = (int) Math.pow(i, 2);
            int cube = (int) Math.pow(i, 3);
            System.out.println(i + " " + square + " " + cube);
        }

        sc.close();
    }
}
