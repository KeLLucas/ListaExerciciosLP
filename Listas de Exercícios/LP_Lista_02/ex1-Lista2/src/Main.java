//Import Scanner
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //Activating the scanner
        Scanner read = new Scanner (System.in);

        //Variables
        int number;

        //Read the number of the user
        System.out.print("Type a number: ");
        number = read.nextInt();

        //Show the answer
        System.out.println("The double of number is : " + doble(number));
    }

    public static int doble(int n){
        return n * 2;
    }
}