package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int acc = 0;
        int index = 0;
        double media;

        while (age > 0) {
            acc = acc + age;
            index ++;
            age = sc.nextInt();
        }
        media = (double) acc / index;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
