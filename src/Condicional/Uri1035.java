package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int sumAB = A + B;
        int sumCD = C + D;

        if(B > C && D > A && sumCD > sumAB) {
            if (C > 0 && D > 0 && A % 2 == 0) {
                System.out.println("Valores Aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();
    }
}
