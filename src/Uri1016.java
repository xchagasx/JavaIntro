import java.util.Locale;
import java.util.Scanner;

public class Uri1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        int calc = km * 2;

        System.out.println(calc + " minutos");

        sc.close();
    }
}
