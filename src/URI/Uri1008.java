package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int func = sc.nextInt();
        int hoursWork = sc.nextInt();
        double hoursTime = sc.nextDouble();

        double calcWork = hoursWork * hoursTime;

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f%n", calcWork);

        sc.close();
    }
}
