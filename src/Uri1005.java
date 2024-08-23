import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double pesos = 3.5 + 7.5;

        double calc = ((notaA * 3.5) + (notaB * 7.5)) / pesos;

        System.out.printf("MEDIA = %.5f%n", calc);

        sc.close();
    }
}
