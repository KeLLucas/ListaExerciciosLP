//Import Scanner
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Activating Scanner
        Scanner read = new Scanner(System.in);

        //Variables
        int number;

        // Read the number's user
        System.out.print("Type a number to know the his square: ");
        number = read.nextInt();

        // Show the result
        System.out.print("The square of the number " + number + " is : " + square(number));
    }

    public static double square(int n){
        // Temporary variable
        double temp;

        // Half the number
        double raiz = n / 2.0;

        // square root calculation
        do {
            temp = raiz;

            raiz = (temp + (n / temp)) / 2;
        } while ((temp - raiz) != 0);

        return raiz;
    }
}