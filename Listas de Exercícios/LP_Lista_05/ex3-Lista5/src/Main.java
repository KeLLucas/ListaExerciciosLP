import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] vetor = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int numero;

        System.out.print("Digite um número: ");
        numero = read.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("O número digitado está na posição: " + i);
                return;
            }
        }

        System.out.println("Valor não encontrado!");
    }
}