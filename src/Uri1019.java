import java.util.Locale;
import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int seconds = sc.nextInt();

        int calcH = seconds / 3600;
        int calcM = (seconds % 3600) / 60;
        int calcS = seconds % 60;

        System.out.println(calcH + ":" + calcM + ":" +  calcS);

        sc.close();
    }
}
