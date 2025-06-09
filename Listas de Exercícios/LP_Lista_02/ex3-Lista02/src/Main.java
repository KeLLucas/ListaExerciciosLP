// Scanner
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);

        // Variables
        double number;

        // Read the user number
        System.out.println("Type a number: ");
        number = read.nextDouble();

        // result
        System.out.println("The fifth part of the number is: " + fifth(number));
    }

    public static double fifth(double n) {
        return n / 5.0;
    }
}

