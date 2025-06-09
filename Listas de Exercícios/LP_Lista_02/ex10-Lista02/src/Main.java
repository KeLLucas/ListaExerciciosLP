// import Scanner and DecimalFormat
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Activating Scanner as "read" and DecimalFormat as "dc"
        Scanner read = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        // Variables
        double distance;

        // Read the distance provided by user
        System.out.print("Type the distance in miles: ");
        distance = read.nextDouble();

        // Show the result
        System.out.println(distance +  " mi --> " + dc.format(miles(distance)) + " Km");
    }

    // Function kilometers to miles
    public static double miles(double n) {
        n *=  1.609344;
        return n;
    }
}
