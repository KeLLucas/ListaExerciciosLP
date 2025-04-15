import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float distancia;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a distancia em m/s: ");
        distancia = in.nextFloat();

        System.out.println("A distancia de " + distancia + " m/s, é equivalente a " + (distancia * 3.6) + " KM/h");
    }
}
