import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float distancia;

        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        System.out.println("Digite a distancia em KM/s: ");
        distancia = in.nextFloat();

        System.out.println("A distancia de " + distancia + " KM/h, é equivalente a " + dc.format((distancia / 3.6)) + " m/s");
    }
}