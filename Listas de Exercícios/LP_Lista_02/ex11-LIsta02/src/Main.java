import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Activating Scanner and DecimalFormat
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.#");

        // Variables
        double temperature;

        // Read the temperature provided by user
        System.out.print("Type the temperature in Celsius: ");
        temperature = in.nextDouble();

        System.out.print(temperature + " ºC --> "  + dc.format(tofahrenheit(temperature)) + " ºF");
    }

    // Function celsius to fahrenheit
    public static double tofahrenheit(double n) {
        n = n * 1.8 + 32;
        return n;
    }
}
