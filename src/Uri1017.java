import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int veloc = sc.nextInt();
        double km_l = 12;

        double calc = ((double) veloc / km_l) * hours;

        System.out.printf("%.3f%n", calc);

        sc.close();
    }
}
