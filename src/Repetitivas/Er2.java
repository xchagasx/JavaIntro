package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Er2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int i = 0;
         int acc = 0;
         double media = 0;

         while (n >= 0) {
             acc = acc + n;
             i = i + 1;
             n = sc.nextInt();
         }
         if (i > 0) {
             media = (double) acc / i;
             System.out.printf("%.2f%n", media);
         } else {
             System.out.println("impossivel calcular");
         }
        sc.close();
    }
}
