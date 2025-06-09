// Importing Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Activating Scanner
        Scanner in = new Scanner(System.in);

        // Variables
        double gradeOne, gradeTwo;

        // Read the students grades
        System.out.print("type the student's two grades separated by spaces: ");
        gradeOne = in.nextDouble();
        gradeTwo = in.nextDouble();

       average(gradeOne, gradeTwo);
    }

    public static void average(double g1, double g2){
        System.out.print("The student average is: " + ((g1 + g2) /2 ));
    }
}