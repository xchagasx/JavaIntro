package Repetitivas.For;

import java.util.Scanner;

public class Uri1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = sc.nextInt();
        int numberAnimal;
        String letraAnimal;
        int calcTotal;

        for (int i = 0; i < cont; i++) {
            numberAnimal = sc.nextInt();
            letraAnimal = sc.next();
            System.out.println(numberAnimal + " " + letraAnimal);

//            for (int x = 0; x < cont; x++) {
//
//            }
//            if (numberAnimal > 0) {
//                calcTotal = numberAnimal;
//                System.out.println("Total = " + calcTotal);
//            }
        }




        sc.close();
    }
}
