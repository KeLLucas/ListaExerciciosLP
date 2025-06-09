import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale locateBR = new Locale("pt", "BR");
        NumberFormat dindin = NumberFormat.getCurrencyInstance(locateBR);

        float valorCliente;
        int escolha;

        System.out.print("Insira o dinheiro: ");
        valorCliente = read.nextFloat();
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Menu:");
        System.out.println("    1. Café Expresso R$0,50");
        System.out.println("    2. Café Longo R$1,00");
        System.out.println("    3. Capuccino R$2,50");
        System.out.println("    4. Chocolate R$2,00");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.print("Escolha uma opção: ");
        escolha = read.nextInt();
        System.out.println("+++++++++++++++++++++++++++");
        switch (escolha) {
            case 1:
                System.out.println("Bebida selecionada: Café Expresso");
                System.out.println("Seu Troco: " + dindin.format(valorCliente- 0.50));
                break;
            case 2:
                System.out.println("Bebida selecionada: Café Longo");
                System.out.println("Seu Troco: " + dindin.format(valorCliente- 1.00));
                break;
            case 3:
                System.out.println("Bebida selecionada: Capuccino");
                System.out.println("Seu Troco: " + dindin.format(valorCliente- 2.50));
                break;
            case 4:
                System.out.println("Bebida selecionada: Chocolate");
                System.out.println("Seu Troco: " + dindin.format(valorCliente- 2.00));
                break;
            default:
                System.out.println("Escolha inválida!");
        }
    }
}
