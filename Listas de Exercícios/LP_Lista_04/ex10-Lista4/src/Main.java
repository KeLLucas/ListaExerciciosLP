import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int qnt, n1 = 1, n2 = 1, n3;

        System.out.println("Digite o número de termos: ");
        qnt = read.nextInt();

        System.out.println("Sequência de Fubonnaci");
        System.out.print(" 1 1 ");

        while (qnt > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            qnt--;
        }
    }
}