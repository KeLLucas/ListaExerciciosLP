import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args) {
        // Activating Scanner and DecimalFormat
        Scanner read = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        // Variables
        double ray, height;

        // Collecting the cylinder measures
        System.out.print("Enter the cone radius: ");
        ray = read.nextDouble();

        System.out.print("Entre the cone height: ");
        height = read.nextDouble();

        // Show the result
        System.out.print("cone volume --> " + dc.format(coneVol(ray, height)) + "cm³");
    }
    // Function cylinder Vol
    public static double coneVol(double radius, double height) {
        // variable
        double volume;

        // calculation
        volume = (Math.PI * Math.pow(radius,2) * height) / 3;

        return volume;
    }
}