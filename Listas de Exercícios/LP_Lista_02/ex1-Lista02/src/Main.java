import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = in.nextInt();

        System.out.println("O dobro do número digitado é: " + (number * 2));
    }
}