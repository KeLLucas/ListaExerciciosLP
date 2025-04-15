import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int escolha;

        System.out.println("Escolha entre as opções de 5 a 9: ");
        System.out.print("--> ");
        escolha = read.nextInt();

        switch (escolha) {
            case 5:
                System.out.println("Opção escolhida: 5");
                break;
            case 6:
                System.out.println("Opção escolhida: 6");
                break;
            case 7:
                System.out.println("Opção escolhida: 7");
                break;
            case 8:
                System.out.println("Opção escolhida: 8");
                break;
            case 9:
                System.out.println("Opção escolhida: 9");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
