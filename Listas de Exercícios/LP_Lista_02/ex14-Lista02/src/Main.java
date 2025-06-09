import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Activating Scanner and DecimalFormat
        Scanner read = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        // Variables
        float height, basis;

        // Reading the triangle measurements
        System.out.print("Triangle height: ");
        height = read.nextFloat();

        System.out.print("Triangel basis: ");
        basis = read.nextFloat();

        // Show the result
        System.out.print("Triangle area : " + dc.format(triangleArea(height, basis)));
    }
    // Function Trangle area
    public static float triangleArea(float height, float basis) {
        // Function variables
        float area;

        //Calculating
        area = (basis * height) / 2;

        return area;
    }

}