package Repetitivas;
import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class Uri1118 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int novoCalculo = 1;

        while (novoCalculo == 1) {
            double nota1 = sc.nextDouble(); // pede-se um número
            while (nota1 < 0.0 || nota1 > 10.0) { // verifica se o número esta entre dentro da condição menor que zero e maior que dez
                System.out.println("nota invalida"); // sáida no terminal caso o número esteja dentro da condição
                nota1 = sc.nextDouble(); // pede-se o número novamente
            }

            double nota2 = sc.nextDouble(); // caso esteja fora da conddição do primeiro "while", pede-se outro número
            while (nota2 < 0.0 || nota2 > 10.0) { // verifica se o número esta entre dentro da condição menor que zero e maior que dez
                System.out.println("nota invalida"); // sáida no terminal caso o número esteja dentro da condição
                nota2 = sc.nextDouble(); // pede-se o número novamente
            }

            double media = (nota1 + nota2) / 2.0; // caso os dois números solicitados estejam fora da condição do "while", fará a média entre eles
            System.out.printf("media = %.2f%n", media); // cálculo da média

            System.out.println("novo calculo (1-sim 2-nao)"); // após calcular a média irá perguntar se deseja novo calculo 1 para sim e 2 para não
            novoCalculo = sc.nextInt(); // solicita no terminal o número para novo cálculo
            while (novoCalculo != 1 && novoCalculo != 2) { // caso esteja dentro da condição irá perguntar novamente novo cálculo
                System.out.println("novo calculo (1-sim 2-nao)"); // saída no terminal pedindo para inserir um número
                novoCalculo = sc.nextInt(); // // solicita no terminal o número para novo cálculo
            }
        }

        sc.close();
    }
}