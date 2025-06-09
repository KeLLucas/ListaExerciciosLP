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
        System.out.print("Type the measure in inch: ");
        measure = in.nextDouble();

        // Show the answer to user
        System.out.println(measure + " in --> " + dc.format(inch(measure)) + "mm");
    }

    // Function inch to millimeters
    public static double inch(double n) {
        n *= 25.4;
        return n;
    }
}