import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double a, b, c, x1, x2, delta;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o valor de a, b e c? ");

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / 2 * a;
        x2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.println(a + " x² + " + b + " x + " + c + " = 0 ");
        System.out.println("x1 = " + x1 + " e x2 " + " = " + x2);
    }
}
