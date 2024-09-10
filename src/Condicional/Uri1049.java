package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String p1;
//        String p2;
//        String p3;
        p1 = sc.nextLine();
//        p2 = sc.next();
//        p3 = sc.next();
        String vert = "vertebrado";

        if (vert == p1) {
            System.out.println("homem");
        } else {
            System.out.println("mulher");
        }
//            if(p2 == "mamifero") {
//                if (p3 == "onivoro") {
//                }
//            }
//        }

        sc.close();
    }
}
