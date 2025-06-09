import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite o primeiro valor: ");
        numero1 = read.nextInt();

        System.out.printf("Digite o segundo valor: ");
        numero2 = read.nextInt();

        if (numero1 == numero2) {
            System.out.printf("Os dois valores são iguais!");
        } else if (numero1 > numero2) {
            System.out.printf("O número " + numero1 + " é maior que o número "+ numero2);
        } else {
            System.out.printf("O número " + numero2 + " é maior que o número "+ numero1);
        }
    }
}
