import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double a, b, x;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o valor de a? ");
        a = in.nextDouble();

        System.out.println("Qual é o valor de b? ");
        b = in.nextDouble();

        System.out.println(a + "x" + " + " + b + " = x");
        x = b * -1 / a;

        System.out.printf("x =" + x);
    }
}
