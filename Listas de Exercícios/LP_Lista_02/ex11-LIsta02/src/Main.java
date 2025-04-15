import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float temperatura;

        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.#");

        System.out.println("Digite a temperatura em graus celcius: ");
        temperatura = in.nextFloat();

        System.out.print("A medida de " + temperatura + " ºC " + " equivale a " + dc.format((temperatura * 1.8 + 32)) + " ºF");
    }
}
