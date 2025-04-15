import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float medida;

        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        System.out.println("Digite a medida em milímetros: ");
        medida = in.nextFloat();

        System.out.print("A medida de " + medida + " mm " + " equivale a " + dc.format((medida / 25.4)) + " in");
    }
}
