package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorFinal = ((maiorAB) + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorFinal + " eh o maior");

        sc.close();
    }
}
