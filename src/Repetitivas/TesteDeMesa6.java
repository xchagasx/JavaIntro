package Repetitivas;

public class TesteDeMesa6 {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        System.out.println("Olá");

        while (x < y) {
            System.out.println(x + "-" + y);
            x = x * 2;
            y = y + 1;
        }
    }
}