package Repetitivas;

public class TesteDeMesa5 {
    public static void main(String[] args) {
        int x = 0;
        int y;

        while (x < 5) {
            y = x * 3;
            System.out.print(y + " ");
            x = x + 1;
        }
        System.out.println("Fim");
    }
}
