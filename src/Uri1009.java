import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String vendedor = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double porc = 15.0;

        double calc = salario + (vendas * porc) / 100;

        System.out.printf("TOTAL = R$ %.2f%n",calc);

        sc.close();
    }
}
