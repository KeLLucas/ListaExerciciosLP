// importing Scanner and DecimalFormat
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Activating Scanner as "read" and DecimalFormat as "dc"
        Scanner read = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        // Variables
        double distance;

        // Read the distance provided by the user
        System.out.println("type the distance in Km/s: ");
        distance = read.nextDouble();

        // Show the result
        System.out.println(distance +"Km/s --> " + dc.format(meters(distance)) + " m/s");
    }

    // function for calculate km/h to m/s
    public static double meters(double n) {
        n = n / 3.6;
        return n;
    }
}