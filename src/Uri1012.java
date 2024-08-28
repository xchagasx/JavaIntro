import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double trian = (A * C) / 2;
        double circ = pi * Math.pow(C, 2);
        double trap = ((A + B) * C) / 2;
        double quad = Math.pow(B, 2);
        double retan = A * B;

        System.out.printf("TRIANGULO: %.3f%n", trian);
        System.out.printf("CIRCULO: %.3f%n", circ);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", quad);
        System.out.printf("RETANGULO: %.3f%n", retan);

        sc.close();
    }
}
