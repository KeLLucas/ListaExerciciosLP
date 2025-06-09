import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Activating Scanner
        Scanner read = new Scanner(System.in);

        //Variables
        float initSpeed, accele, time;

        // Collecting infos
        System.out.println("What is the initial speed? ");
        initSpeed = read.nextFloat();

        System.out.println("What is the acceleration? ");
        accele = read.nextFloat();

        System.out.println("What is the time? ");
        time = read.nextFloat();

        System.out.println("Final speed --> " + finalSpeed(initSpeed, accele, time) + " m/s");
    }
    // Function final speed
    public static float finalSpeed(float initvel, float accel, float time){
        // Variables
        float fSpeed;

        // Calculus
        fSpeed = (initvel + accel * time);

        return fSpeed;
    }
}
