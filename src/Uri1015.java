import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1, y1;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        double x2, y2;
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", dist);

        sc.close();
    }
}
