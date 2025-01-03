package Repetitivas.For;

import java.util.Locale;
import java.util.Scanner;

public class Uri1132 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        int calc =  n1 - n2;
        if (n1 > n2) {
            int calc1 =  n1 - n2;
                for (int i = 0; i < calc1; i = i + calc1) {
                    if (calc1 % 13 != 0) {
                        calc1 = calc1 + calc1;
                    }
                }
            System.out.println(calc1);
        }
//        System.out.println(calc1);
//        if (n1 > n2) {
//            int calc1 =  n1 - n2;
//            System.out.println(calc1);
//            if (calc1 % 13 != 0) {
//
//            }
//        } else {
//            int calc1 = n2 - n1;
//            System.out.println(calc1);
//        }

        sc.close();
    }
}
