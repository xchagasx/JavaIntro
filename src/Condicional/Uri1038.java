package Condicional;
import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int lanche, quant;
        lanche = sc.nextInt();
        quant = sc.nextInt();
        double value;

        switch (lanche) {
            case 1:
                value = 4.00;
                break;
            case 2:
                value = 4.50;
                break;
            case 3:
                value = 5.00;
                break;
            case 4:
                value = 2.00;
                break;
            case 5:
                value = 1.50;
                break;
            default:
                value = 0.0;
                break;
        }
        System.out.printf("Total: R$ %.2f%n", value * quant);
        sc.close();
    }
}
