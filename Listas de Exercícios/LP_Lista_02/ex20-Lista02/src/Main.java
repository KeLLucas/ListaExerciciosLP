import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int raiz1, raiz2;
        String equacao;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira raiz: ");
        raiz1 = in.nextInt();

        System.out.println("Digite a segunda raiz: ");
        raiz2 = in.nextInt();

        equacao = "A equação de segundo grau das raizes é: x² + " + (-1 * (raiz1 + raiz2))+ "x " + "+ " + (raiz1 * raiz2) + " = 0";
        System.out.println(equacao);
    }
}
