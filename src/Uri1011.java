import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int raio = sc.nextInt();
        double quatroPtres = 4/3.0;
        double pi = 3.14159;

        double calcEsf = (quatroPtres) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", calcEsf);

        sc.close();
    }
}
