import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero;

        System.out.println("Type a number: ");
        numero = read.nextInt();

        System.out.println("== Tabuada do " + numero + " ==");
         for (int i=0; i <=10; i++) {
             System.out.println("   " + numero + " x " + i + " = " + (numero * i));
         }
        System.out.printf("===================");
    }
}