import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero1, numero2;

        numero1 = read.nextInt();
        numero2 = read.nextInt();

        if (numero1 < numero2) {
            for (int i = numero1 + 1; i < numero2; i++) {
                System.out.print(i + " ");
            }
        } else if (numero1 > numero2) {
            for (int i = numero1 - 1; i > numero2; i--) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("Os numeros sao iguais");
        }
    }
}