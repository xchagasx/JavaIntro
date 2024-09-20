package Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {

            // se for impar, some mais 1
            if (x % 2 != 0) {
                x = x + 1;
            }

            // expressao simplificada: 5 * x + 20
            int soma = x + x + 2 + x + 4 + x + 6 + x + 8; // 4 + 4 + 2 + 4 + 4 + 4 + 6 + 4 + 8 = 40
            System.out.println(soma);

            x = sc.nextInt();
        }

        sc.close();
    }
}
