import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float medida;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em polegadas: ");
        medida = in.nextFloat();

        System.out.print("A medida de " + medida + " in " + " equivale a " + (medida * 25.4) + " mm");
    }
}