import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float base, altura;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do triangulo retângulo: ");
        base = in.nextFloat();

        System.out.println("Digite o tamanho da altura do triangulo retângulo: ");
        altura = in.nextFloat();

        System.out.print("Um triangulo retangulo com raio de " + base + " e uma altura de " + altura +" tem um volume de " + ((base * altura) / 2.0));
    }
}