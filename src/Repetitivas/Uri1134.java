package Repetitivas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1134 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tipoCombust = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipoCombust < 4 || tipoCombust > 4) {
            if (tipoCombust > 4) {
                tipoCombust = sc.nextInt();
            }
            else if (tipoCombust == 1) {
                alcool++;
                tipoCombust = sc.nextInt();
            }
            else if (tipoCombust == 2) {
                gasolina++;
                tipoCombust = sc.nextInt();
            }
            else if (tipoCombust == 3) {
                diesel++;
                tipoCombust = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
