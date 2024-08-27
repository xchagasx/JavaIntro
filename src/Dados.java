import java.util.Locale;
import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1;
        int idade1;
        nome1 = sc.next();
        idade1 = sc.nextInt();

        String nome2;
        int idade2;
        nome2 = sc.next();
        idade2 = sc.nextInt();

        double media = ((double) idade1 + idade2) / 2;

        System.out.printf( "A idade média de %s e %s é de %.1f%n anos", nome1, nome2, media);

        sc.close();
    }
}
