package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Hi, Hf;
        Hi = sc.nextInt();
        Hf = sc.nextInt();

        int calcH = (24 - Hi) + Hf;

        sc.close();
    }
}
