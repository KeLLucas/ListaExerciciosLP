//Importing Scanner
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Activating Scanner and DecimalFormat
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        // Variables
        double distance;

        // Read the distance provided by user
        System.out.print("Type the distance in  m/s: ");
        distance = in.nextDouble();

        // Show the result
        System.out.println( distance + " m/s --> " + dc.format(kilometers(distance)) + " Km/h");
    }

    // function m/s to km/h
    public static double kilometers(double n) {
        n *= 3.6;

        return n;
    }

}
