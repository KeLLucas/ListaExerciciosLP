import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float distancia;

        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        System.out.println("Digite a distancia em milhas: ");
        distancia = in.nextFloat();

        System.out.print("A medida de " + distancia + " mi " + " equivale a " + dc.format((distancia * 1.6093445)) + " km");
    }
}