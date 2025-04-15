import java.util.Scanner;
import  java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float raio, altura;

        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.##");

        System.out.println("Digite o tamanho do raio da base do cone: ");
        raio = in.nextFloat();

        System.out.println("Digite o tamanho da altura do cone: ");
        altura = in.nextFloat();

        System.out.print("Um cone com o raio da base de " + raio + "e uma altura de " + altura +" tem um volume de " + dc.format(((Math.PI * Math.pow(raio, 2)) * altura) / 3));
    }
}
