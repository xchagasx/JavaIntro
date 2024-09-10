package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt(); // 7
        int minutoInicial = sc.nextInt(); // 8
        int horaFinal = sc.nextInt(); // 9
        int minutoFinal = sc.nextInt(); // 10

        int instanteInicial = horaInicial * 60 + minutoInicial; // 428
        int instanteFinal = horaFinal * 60 + minutoFinal; // 550

        int duracao;
        if (instanteInicial < instanteFinal) { // 428 - 550 = -122
            duracao = instanteFinal - instanteInicial; // 550 - 428 = 122
        }
        else {
            duracao = (24 * 60 - instanteInicial) + instanteFinal;// (1440 - 428) + 550 = 1562
        }

        int duracaoHoras = duracao / 60; // 122 / 60 = 2
        int duracaoMinutos = duracao % 60; // 122 / 60 = 2 'se sobrou algum valor dessa divisão'

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        sc.close();
    }
}
