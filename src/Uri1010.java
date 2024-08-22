import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codA;
        int quantA;
        boolean valueA;
        codA = sc.nextInt();
        quantA = sc.nextInt();
//        sc.nextLine();
        valueA = sc.hasNextDouble();

        int codB;
        int quantB;
        boolean valueB;
        sc.nextLine();
        codB = sc.nextInt();

        quantB = sc.nextInt();
        valueB = sc.hasNextDouble();

        double calc;

//        calc = (boolean) quantA * valueA + quantB * valueB;

        System.out.printf("VALOR A PAGAR = %.2f%n", calc);

        sc.close();
    }
}
