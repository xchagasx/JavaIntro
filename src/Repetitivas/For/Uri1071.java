package Repetitivas.For;

import java.util.Scanner;

public class Uri1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int min, max;

        if (X < Y) {
            min = X;
            max = Y;
        } else {
            min = Y;
            max = X;
        }

        int soma = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                soma = soma + 1;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
