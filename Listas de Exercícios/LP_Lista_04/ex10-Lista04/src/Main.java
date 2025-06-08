import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qtd, n1 = 1, n2 = 1, n3;

        System.out.println("Digite a quantidade de termos");

        qtd = read.nextInt();

        System.out.print("1 ");
        System.out.print("1 ");

        qtd = qtd - 2;

        while (qtd > 0) {
            System.out.print((n1+n2) + " ");
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            qtd--;
        }
        System.out.println("Fim");
    }
}