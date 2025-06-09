import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
       // Activating Scanner and DecimalFormat
        Scanner read = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        //Variables
        double grade1 = 0, grade2 = 0;

        // Read the students average
        for (int  i = 1; i <= 2;i++){
            System.out.print("Enter the student's " + i + "ª grade --> ");
            if (i == 1){
                grade1 = read.nextDouble();
            } else {
                grade2 = read.nextDouble();
            }
        }

        System.out.println("The student's grade is " + dc.format(average(grade1, grade2)));
    }

    // Function media
    public static Double average(double g1, double g2) {
        // Function variable
        double average;

        // Calculating the average
        average = ((g1 + (g2 * 2)) / 3); //Dividir pela soma dos pesos

        return average;
    }
}

