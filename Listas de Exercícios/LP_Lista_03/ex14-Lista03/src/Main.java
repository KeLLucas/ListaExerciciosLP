import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale locateBR = new Locale("pt", "BR");
        NumberFormat dindin = NumberFormat.getCurrencyInstance(locateBR);

        double valorCompra, valorFinal;
        int escolha, parcelas;

        System.out.print("Insira o valor da compra: ");
        valorCompra = read.nextFloat();
        System.out.println("===============================");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("===============================");
        System.out.print("Escolha uma forma de pagamento: ");
        escolha = read.nextInt();
        System.out.println("===============================");
        switch (escolha){
            case 1:
                System.out.println("Débito Selecionado");
                System.out.println("===============================");
                System.out.println("Você recebeu um desonto de 5%");
                valorFinal = (valorCompra - (valorCompra * 0.05));
                System.out.println("Valor final da compra: " + dindin.format(valorFinal));
                break;
            case 2:
                System.out.println("Pix Selecionado");
                System.out.println("===============================");
                System.out.println("Você recebeu um desonto de 10%");
                valorFinal = (valorCompra - (valorCompra * 0.10));
                System.out.println("Valor final da compra: " + dindin.format(valorFinal));
                break;
            case 3:
                System.out.println("Crédito Selecionado");
                System.out.println("===============================");
                System.out.print("Escolha o número de parcelas [MAX:10]: ");
                parcelas = read.nextInt();
                if (parcelas > 0 && parcelas <= 4) {
                    valorFinal = (valorCompra * 1.02);
                    System.out.println("Valor final da compra: " + dindin.format(valorFinal));
                } else if (parcelas > 4 && parcelas <= 10) {
                    valorFinal = (valorCompra * 1.05);
                    System.out.println("Valor final da compra: " + dindin.format(valorFinal));
                } else if (parcelas < 0) {
                    System.out.println("Número de parcelas inválido!");
                } else {
                    System.out.println("Número de parcelas inválido!");
                }
        }
    }
}
