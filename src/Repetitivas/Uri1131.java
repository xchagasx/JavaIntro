package Repetitivas;
import java.util.Locale;
import java.util.Scanner;

public class Uri1131 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int decisao, gols;
        decisao = sc.nextInt();
        gols = sc.nextInt();
        int empate1 = 0;
        int gremio2 = 0;
        int inter3 = 0;
        int novoGrenal = 1;
        int acc = 0;

        while (novoGrenal == 1) {
            while (decisao == 1 || decisao == 2 || decisao == 3) {
                empate1++;
                System.out.println("Novo grenal (1-sim 2-não)");
            }
            novoGrenal = sc.nextInt();
        }
//        if (decisao == 3) {
//            inter3 ++;
//            System.out.println("Novo grenal (1-sim 2-não)");
//            novoGrenal = sc.nextInt();
//        } else if (decisao == 2) {
//            gremio2++;
//            System.out.println("Novo grenal (1-sim 2-não)");
//            novoGrenal = sc.nextInt();
//        } else if (decisao == 1) {
//            novoGrenal = sc.nextInt();
//        }
//
//                if (novoGrenal == 1) {
//                    novoGrenal ++;
//                    decisao = sc.nextInt();
//                    gols = sc.nextInt();
//                }
//                System.out.println("Novo grenal (1-sim 2-não)");
//                novoGrenal = sc.nextInt();
//            }
//            while (novoGrenal == 1) {
//                novoGrenal = acc ++;
//                decisao = sc.nextInt();
//                gols = sc.nextInt();
//            }
        sc.close();
    }
}
