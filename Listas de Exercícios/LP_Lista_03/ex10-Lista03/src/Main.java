import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = read.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = read.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = read.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            if (numero2 > numero3) {
                System.out.println(numero3 + " " + numero2 + " " + numero1);
            }else {
                System.out.println(numero2 + " " + numero3 + " " + numero1);
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            if (numero1 > numero3) {
                System.out.println(numero3 + " " + numero1 + " " + numero2);
            }else {
                System.out.println(numero1 + " " + numero3 + " " + numero2);
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            if (numero2 > numero1) {
                System.out.println(numero1 + " " + numero2 + " " + numero3);
            }else {
                System.out.println(numero2 + " " + numero1 + " " + numero3);
            }
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
