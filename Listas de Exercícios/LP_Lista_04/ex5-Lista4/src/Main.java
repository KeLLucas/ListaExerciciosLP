import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero, fatorial = 1;

        numero = read.nextInt();

        for (int i = 2; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println(numero + "! = " + fatorial);

    }
}