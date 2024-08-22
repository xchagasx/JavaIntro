import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cons = sc.nextInt();
        double dist = sc.nextDouble();

        double calc = cons / dist;
        String km = "km/l";

        System.out.printf("%.3f%n", calc);
        System.out.print(km);

        sc.close();
    }
}
