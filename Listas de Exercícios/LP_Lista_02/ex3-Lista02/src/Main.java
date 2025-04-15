import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        float number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        number = in.nextFloat();

        System.out.println("A quinta parte do numero digitado é: " + (number / 5.0));
    }
}
