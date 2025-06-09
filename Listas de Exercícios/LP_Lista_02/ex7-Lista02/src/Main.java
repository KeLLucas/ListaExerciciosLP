// import Scanner and DecimalFormat
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Activating Scanner as "read" and DecimalFormat as "dc"
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.###");

        // Variables
        double measure;

        // Read the measure provided by user
        System.out.print("Type the measure in millimeters: ");
        measure = in.nextDouble();

        // Show the answer to user
        System.out.println(measure + " mm --> " + dc.format(inch(measure)) + "in");
    }

    // Function millimeters to inch
    public static double inch(double n) {
        n = n / 25.4;
        return n;
    }
}