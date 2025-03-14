import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        number = in.nextInt();

        System.out.println("O quadrado do numero digitado é: " + Math.pow(number,2));
    }
}