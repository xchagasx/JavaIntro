import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();

        double calc = (notaA + notaB) / 2.0;

        System.out.printf("MEDIA = %.5f%n", calc);

        sc.close();
    }
}
