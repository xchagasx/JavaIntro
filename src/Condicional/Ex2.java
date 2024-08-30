package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a < b && a < c || a == b || a == c) {
            System.out.println("MENOR = " + a);
        } else if (b < a && b < c || b == c) {
            System.out.println("MENOR = " + b);
        } else if (c < a && c < b) {
            System.out.println("MENOR = " + c);
        }
        sc.close();
    }
}
