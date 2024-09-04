package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, n4;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        float calcMp = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f%n", calcMp);

        if (calcMp >= 5.0 && calcMp <= 6.9) {
            System.out.println("Aluno em exame.");
            float nE = sc.nextFloat();
            float calcMpnE = (calcMp + nE) / 2;
            System.out.printf("Nota do exame: %.1f%n", nE);
            if (calcMpnE >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", calcMpnE);
        }
        else if (calcMp >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (calcMp < 5.0) {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}
