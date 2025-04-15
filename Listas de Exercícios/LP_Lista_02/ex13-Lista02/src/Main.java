import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float raio;

        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        System.out.println("Digite o raio do circulo: ");
        raio = in.nextFloat();

        System.out.print("Um circulo com raio de " + raio + " tem uma área de " + dc.format((Math.PI * raio * raio)));
    }
}
