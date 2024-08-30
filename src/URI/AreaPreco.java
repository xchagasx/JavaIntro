package URI;

import java.util.Locale;
import java.util.Scanner;

public class AreaPreco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double larg = sc.nextDouble();
        double comp = sc.nextDouble();
        double valueM = sc.nextDouble();

        double calcArea = larg * comp;
        double calcPrec = calcArea * valueM;

        System.out.printf("AREA = %.2f%n", calcArea);
        System.out.printf("PRECO = %.2f%n", calcPrec);

        sc.close();
    }
}
