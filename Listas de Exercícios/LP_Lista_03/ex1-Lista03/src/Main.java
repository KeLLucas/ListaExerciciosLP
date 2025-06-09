import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double numero, raizQuadrada;

        System.out.print("Dígite um número para saber sua raíz quadrada: ");
        numero = leia.nextDouble();
        raizQuadrada = Math.sqrt(numero);

        if (numero == 0) {
            System.out.println("A raiz quadrada de " + String.format("%.0f", numero) + " é igual a 0" );
        } else if (numero > 0) {
            System.out.println("A raiz quadrada de " + String.format("%.0f", numero) + " é igual a " + String.format("%.2f", raizQuadrada));
        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
