import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Activating Scanner and DecimalFormat
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        // Variables
        double radius;

        // Read the circle's radius
        System.out.print("Enter the circle radius: ");
        radius= in.nextDouble();

        System.out.print("The circle's area is " + dc.format(circleArea(radius)));
    }
    // Function circle area
    public static double circleArea(double radius) {
        // calculating the circle area
        radius =  Math.PI * Math.pow(radius, 2);

        return radius;
    }
}
