package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota = sc.nextDouble();
        int acc = 0;
        int i = 0;
        double media = 0;

        while (nota >= 0 && nota <= 10) {
            acc = acc + 1;
            i = (int) nota + i;
            if (acc == 2 && nota >= 0) {
                media = i / acc;
                System.out.println(media);
                sc.close();
            } else {
                System.out.println("nota invalida");
                nota = sc.nextDouble();
            }
        }
        sc.close();
    }
}
