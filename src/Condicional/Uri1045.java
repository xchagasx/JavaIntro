package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double A2 = Math.pow(A, 2);
        double B2 = Math.pow(B, 2);
        double C2 = Math.pow(C, 2);
        double bc = B + C;
        double bc2 = B2 + C2;

        if (A >= bc) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A2 == bc2) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (A2 > bc2 || A == B || B == C || C == A) {
            System.out.println("TRIANGULO OBTUSANGULO");
            System.out.println("TRIANGULO ISOSCELES");
        } else if (A2 < bc2 && A == B && B == C && C == A) {
            System.out.println("TRIANGULO ACUTANGULO");
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A2 < bc2) {
            System.out.println("TRIANGULO ACUTANGULO");
            System.out.println("TRIANGULO EQUILATERO");
            if (A == B || B == C || C == A) {
                System.out.println();
            } else {
                System.out.println(" ");
            }

            System.out.println(A2 + " " + B2 + " " + C2);

            sc.close();
        }
    }
}