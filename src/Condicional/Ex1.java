package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double sumNotas = nota1 + nota2;

        if (sumNotas > 60.0) {
            System.out.printf("NOTA FINAL = " + sumNotas);
        } else {
            System.out.printf("NOTA FINAL = " + sumNotas + "\n");
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
