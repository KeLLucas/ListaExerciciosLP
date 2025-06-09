import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float numero1, numero2;
        int escolha;

        System.out.print("Digite o primeiro número: ");
        numero1 = read.nextFloat();
        System.out.print("Digite o segundo número: ");
        numero2 = read.nextFloat();
        System.out.println("-----------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtração");
        System.out.println("    3. Multiplicação");
        System.out.println("    4. Divisão");
        System.out.println("-----------------------------");
        System.out.print("Escolha uma opção: ");
        escolha = read.nextInt();
        System.out.println("-----------------------------");
        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + numero1 + " x " + numero2 + " = " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Impossivel dividir por 0");
                }else {
                    System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                }
                break;
            default:
                System.out.println("Número invalido!");
        }
    }
}
