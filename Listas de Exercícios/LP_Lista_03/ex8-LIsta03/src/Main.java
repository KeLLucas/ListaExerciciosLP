import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = read.nextInt();

        System.out.println( (numero % 2 == 0 ? "Par" : "Impar") );
    }
}
